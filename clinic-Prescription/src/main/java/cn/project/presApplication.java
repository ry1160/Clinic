package cn.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "cn.project.mapper")
public class presApplication {
    public static void main(String[] args) {
        SpringApplication.run(presApplication.class,args);
    }
}
