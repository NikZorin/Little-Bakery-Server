package com.zorin.by.littlebakery.littlebakery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/security")
    public void checkSecurity() {

    }
}
