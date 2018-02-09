package com.lincy.springbootstarter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LinChangyi
 * @date 2018/2/9
 **/
@RestController
public class HelloController {
    @RequestMapping
    public String hello() {
        return "Hello world!";
    }
}
