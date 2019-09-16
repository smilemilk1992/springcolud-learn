package com.springcolud.serverfeign.controller;


import com.springcolud.serverfeign.remote.HelloRemote123;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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