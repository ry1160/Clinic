package cn.project.controller;

import cn.project.utils.HttpRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/info")
    public HttpRequest info(HttpServletRequest request){
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        CloseableHttpResponse response = null;
        HttpGet httpGet = new HttpGet("http://localhost:8082/hello");
        String cookie = "";
        for (Cookie cookie1 : request.getCookies()){
            cookie += cookie1.getName()+"="+cookie1.getValue()+";";
        }
        System.out.println(cookie);
        httpGet.addHeader("Cookie",cookie);
        try {
            response = httpClient.execute(httpGet);
            String result = EntityUtils.toString(response.getEntity());
            return HttpRequest.ok(result);
        } catch (IOException e) {
            e.printStackTrace();
            return HttpRequest.error(e.getMessage());
        }
    }
}
