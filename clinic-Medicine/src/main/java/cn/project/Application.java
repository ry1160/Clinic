package cn.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(basePackages = "cn.project.mapper")
@EnableOAuth2Sso
@EnableCaching
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
