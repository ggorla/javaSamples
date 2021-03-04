package com.example.samplecode.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRest {

    @GetMapping("/hello-world/{text}")
    public String HelloWorld(@PathVariable String text){
        return text;
    }

    //http://localhost:8080/hello-world/hello

        // USD ->INR
        //10 ->750


}
