package cn.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(basePackages = "cn.project.mapper")
@EnableCaching
public class MedApplication {
    public static void main(String[] args) {
        SpringApplication.run(MedApplication.class,args);
    }
}
