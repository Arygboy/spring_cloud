package com.hwz.hello.controller;

import com.hwz.hello.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = {"/", "/index"})
    @HystrixCommand(fallbackMethod = "hiError")
    public String hello() {
        return helloService.helloService();
    }

    public String hiError() {
        return "hi,word! sorry,error!";
    }
}
