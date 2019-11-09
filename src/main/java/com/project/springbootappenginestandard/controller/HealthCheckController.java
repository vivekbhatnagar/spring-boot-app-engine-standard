package com.project.springbootappenginestandard.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/status")
    public ResponseEntity getStatus(){
        return ResponseEntity.ok("<html>Hey, I am up !</html>");
    }
}
