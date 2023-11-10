package com.example.maven;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class StanController {

    @GetMapping("/stan")
    public String hello() {
        return "Successfully Deployment Maven!!!!!!";
    }
}
