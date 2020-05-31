package com.dk.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DockerController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/")
    public String index(Model model) {
        System.out.println("Time：" + System.currentTimeMillis());
        model.addAttribute("port", port);
        return "index";
    }
}