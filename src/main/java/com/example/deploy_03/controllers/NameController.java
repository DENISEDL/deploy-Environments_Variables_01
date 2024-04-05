package com.example.deploy_03.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")

public class NameController {

    @Value("${authCode}")
    private String authCode;

    @Value("${devName}")
    private String devName;

    @GetMapping("/")
    public String getProperty(){
        return "Ciao " + devName + " il tuo authCode è : " + authCode;
    }
}
