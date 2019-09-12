package com.springcolud.consumer1.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@FeignClient(name = "spring-cloud-producer1")
public interface HelloRemote1 {

    @RequestMapping(value = "/hello1/{name}")
    public String hello1(@PathVariable( "name") String name);


    @RequestMapping(value = "/getInfo")
    public String oidGetNidList(@RequestParam(value = "id") String id);
    /**
     *  @RequestMapping("/hello")
     *     public String index() {
     *         return "hello  ，this is first messge";
     *     }
     */


}
