package com.springcolud.producer.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RequestParam注解是获取静态URL传入的参数
 *
 * @PathVariable是获取请求路径中的变量作为参数
 * @author haochen
 * @date 2019/9/11 16:17
 */
@RestController
public class HelloController {
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable( "name") String name) {
        return "hello  ，" +name;
    }
}
