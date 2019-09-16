package com.springcolud.consumer.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 Feign 采用的是基于接口的注解
 Feign 整合了ribbon，具有负载均衡的能力
 整合了Hystrix，具有熔断的能力,默认是不打开的 ，feign.hystrix.enabled=true
 */
@FeignClient(name = "spring-cloud-producer")
public interface HelloRemote {

    @RequestMapping(value = "/hello/{name}")
    public String hello1(@PathVariable("name") String name);

    /**
     *  @RequestMapping("/hello")
     *     public String index() {
     *         return "hello  ，this is first messge";
     *     }
     */


}
