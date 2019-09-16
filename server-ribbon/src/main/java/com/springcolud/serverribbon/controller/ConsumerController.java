package com.springcolud.serverribbon.controller;

import com.springcolud.serverribbon.remote.HelloServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConsumerController {

    @Autowired
    HelloServer helloServer;


    @GetMapping(value = "/getInfo")
    public String oidGetNidList(@RequestParam(value = "id") String id){return helloServer.getInfo(id);};

}