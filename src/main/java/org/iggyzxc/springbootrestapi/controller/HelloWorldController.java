package org.iggyzxc.springbootrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    // HTTP GET Request
    @GetMapping("/hello")
    public String HellowWorld() {
        return "Hello World";
    }
}
