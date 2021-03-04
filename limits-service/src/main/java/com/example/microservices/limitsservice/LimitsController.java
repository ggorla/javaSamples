package com.example.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private configuration configuration;

    @GetMapping("/lmits")
    public Limits retriveLimits(){

        return  new Limits(configuration.getMin(),configuration.getMax());
        //return new Limits(1,1000);
    }
}
