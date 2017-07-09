package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hong on 2017-07-09.
 */
@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
