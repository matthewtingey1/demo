package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class DemoController {

    @GetMapping("/")
    public String demo () {
        System.out.println("Hello World");
        //model.put("message", "Bai's art gig");
        return "index";
    }
}
