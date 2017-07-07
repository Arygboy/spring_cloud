package com.hwz.hello.controller;

import com.hwz.hello.service.SchedualServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloerController {
    @Autowired
    private SchedualServiceHello schedualServiceHello;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String sayHi() {
        return schedualServiceHello.sayHiFromClient();
    }
}
