package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by claudialopez on 28-07-17.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "Hola Mundo!";
    }
}
