package cn.project.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.EntityTemplate;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class ClientController {
    @GetMapping("/toLogin")
    public String toLogin(){
        return "login";
    }
    @GetMapping("/getCode")
    public void getCode(HttpServletResponse response){
        try {
            response.sendRedirect("http://localhost:8080/oauth/authorize?response_type=code&client_id=client&redirect_uri=http://localhost:8082/login&scope=app");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @GetMapping("/login")
    public String login(String code){
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        CloseableHttpResponse response = null;
        HttpPost httpPost = new HttpPost("http://localhost:8080/oauth/token");
        List<NameValuePair> list = new ArrayList<>();
        list.add(new BasicNameValuePair("grant_type","authorization_code"));
        list.add(new BasicNameValuePair("scope","app"));
        list.add(new BasicNameValuePair("redirect_uri","http://localhost:8082/login"));
        list.add(new BasicNameValuePair("code",code));
        list.add(new BasicNameValuePair("client_id","client"));
        list.add(new BasicNameValuePair("client_secret","secret"));
        try {
            HttpEntity entity = new UrlEncodedFormEntity(list);
            httpPost.setEntity(entity);
            response = httpClient.execute(httpPost);
            ObjectMapper objectMapper = new ObjectMapper();
            String result = EntityUtils.toString(response.getEntity());
            return "redirect:/info?access_token="+objectMapper.readValue(result, Map.class).get("access_token");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    @GetMapping("/info")
    public String info(String access_token, Model model){
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        CloseableHttpResponse response = null;
        HttpGet httpGet = new HttpGet("http://localhost:8081/oauth2/demo?access_token="+access_token);
        try {
            response = httpClient.execute(httpGet);
            System.out.println(response.getStatusLine().getStatusCode());
            HttpEntity entity = response.getEntity();
            ObjectMapper objectMapper = new ObjectMapper();
            String result = EntityUtils.toString(entity);
            model.addAttribute("data",result);
            return "index";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
