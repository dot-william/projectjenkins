package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @GetMapping("/getSquaredValue/{valueToSquare}")
    long getSquaredValue(@PathVariable("valueToSquare") Long valueToSquare) {
        System.out.println("Hello world");
        return valueToSquare*valueToSquare;
    }
}
