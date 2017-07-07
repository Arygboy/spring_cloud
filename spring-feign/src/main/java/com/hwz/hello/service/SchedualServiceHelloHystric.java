package com.hwz.hello.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHelloHystric implements SchedualServiceHello{
    @Override
    public String sayHiFromClient() {
        return "soory,word!";
    }
}
