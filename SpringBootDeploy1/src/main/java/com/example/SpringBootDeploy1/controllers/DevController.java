package com.example.SpringBootDeploy1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev")
public class DevController {
    @GetMapping
    public String name() {
        return "Ubaldo";
    }
}
