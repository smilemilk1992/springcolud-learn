package com.springcolud.consumer.controller;

import com.springcolud.consumer.remote.HelloRemote;
import com.springcolud.consumer.remote.HelloRemote1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HelloRemote HelloRemote;

    @Autowired
    HelloRemote1 HelloRemote1;
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return HelloRemote.hello1(name);
    }

    @RequestMapping("/hello1/{name}")
    public String index1(@PathVariable("name") String name) {
        return HelloRemote1.hello1(name);
    }

}