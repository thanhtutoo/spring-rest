package org.example.springrestapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping("/world")
    String getAllMovies()
    {
        log.info("Hello Controller "+ Thread.currentThread().getName());
        return "Hello";
    }

}


