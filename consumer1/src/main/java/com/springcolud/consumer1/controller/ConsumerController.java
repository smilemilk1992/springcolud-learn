package com.springcolud.consumer1.controller;


import com.springcolud.consumer1.remote.HelloServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class ConsumerController {

    @Autowired
    HelloServer helloServer;


    @GetMapping(value = "/getInfo")
    public String oidGetNidList(@RequestParam(value = "id") String id){return helloServer.getInfo(id);};

}