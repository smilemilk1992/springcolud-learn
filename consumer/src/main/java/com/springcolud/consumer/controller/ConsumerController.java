package com.springcolud.consumer.controller;
import com.springcolud.consumer.remote.HelloRemote123;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
public class ConsumerController {


    @Resource
    HelloRemote123 HelloRemote1;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return HelloRemote1.hello1(name);
    }

    @RequestMapping("/hello1/{name}")
    public String index1(@PathVariable("name") String name) {
        return HelloRemote1.hello1(name);
    }

    @RequestMapping(value = "/getInfo")
    public String oidGetNidList(@RequestParam(value = "id") String id) {
        return HelloRemote1.oidGetNidList(id);
    }

    ;
}