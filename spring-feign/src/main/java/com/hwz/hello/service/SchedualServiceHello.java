package com.hwz.hello.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hello")
public interface SchedualServiceHello {

    @RequestMapping(value = {"/","/index"},method = RequestMethod.GET)
    String sayHiFromClient();
}
