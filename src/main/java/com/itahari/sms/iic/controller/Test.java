package com.itahari.sms.iic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/")
    public String welcome() {
        return "WELCOME!!";
    }
}
