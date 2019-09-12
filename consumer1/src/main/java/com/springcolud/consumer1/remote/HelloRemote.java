package com.springcolud.consumer1.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "spring-cloud-producer")
public interface HelloRemote {

    @RequestMapping(value = "/hello/{name}")
    public String hello1(@RequestParam(value = "name") String name);

    /**
     *  @RequestMapping("/hello")
     *     public String index() {
     *         return "hello  ，this is first messge";
     *     }
     */


}
