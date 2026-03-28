package com.rahi.app.Rahi.App;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @Value("${env.name}")
    private String envName;

    @GetMapping("/test")
    public String test(){
        return "This is : "+envName;
    }
}
