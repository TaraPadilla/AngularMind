package com.fertmind66.FertMindBack.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
    @GetMapping("/test")
    public String testEndpoint() {
        return "Hello, Fertmind66 is up and running!";
    }
}
