package com.EasyDrive.controllers;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Hidden
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "Hello World!";
    }
}
