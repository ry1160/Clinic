package cn.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Oauth2Controller {
    @GetMapping("/custom/login")
    public String login() {
        return "oauth/login";
    }
}
