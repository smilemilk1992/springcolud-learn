package com.springcolud.producer1.controller;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haochen
 * @date 2019/9/11 16:17
 */
@RestController
@EnableDiscoveryClient
public class HelloController {
    @RequestMapping("/hello1/{name}")
    public String index(@RequestParam(value = "name") String name) {
        return "hello1  ，" +name;
    }
}
