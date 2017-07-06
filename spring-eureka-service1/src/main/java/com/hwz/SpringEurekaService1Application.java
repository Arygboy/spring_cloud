package com.hwz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaServer
@SpringBootApplication
public class SpringEurekaService1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringEurekaService1Application.class, args);
    }

    @Value("${service.port}")
    String port;

    @RequestMapping(value = {"/", "index"})
    public String index() {
        return "hello word,i am port:" + port;
    }
}
