package com.springcolud.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haochen
 * @date 2019/9/11 16:17
 */
@RestController
public class HelloController {
    @RequestMapping("/hello/{name}")
    public String index(@RequestParam(value = "name") String name) {
        return "hello  ，" +name;
    }
}
