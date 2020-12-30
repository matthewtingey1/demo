package com.example.demo.controller;

import com.example.demo.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("thyme")
    public String greeting (Map<String, Object> model) {
        String mark = "Mark is Cool!";
        model.put("message", "Check out this web app Bai & " + mark);
        return "thyme";
    }

}
