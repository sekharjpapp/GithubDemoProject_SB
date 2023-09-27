package com.pixel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/getGreeting")
    public String getGreetings() {
        return "Hello , World!!!";
    }
}
