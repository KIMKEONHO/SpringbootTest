package com.example.test3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainContoller {
    @GetMapping("/hi")
    public String hi(){

        return "view/hi";
    }

}