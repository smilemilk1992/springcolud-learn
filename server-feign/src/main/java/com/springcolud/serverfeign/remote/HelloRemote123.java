package com.springcolud.serverfeign.remote;

import com.springcolud.serverfeign.Hystric.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * 此类中的方法和远程服务中contoller中的方法名和参数需保持一致。加了熔断器
 */
@FeignClient(name = "spring-cloud-producer", fallback = SchedualServiceHiHystric.class)
public interface HelloRemote123 {

    @RequestMapping(value = "/hello/{name}")
    public String hello(@PathVariable("name") String name);

    @RequestMapping(value = "/hello1/{name}")
    public String hello1(@PathVariable("name") String name);

    @RequestMapping(value = "/getInfo")
    public String oidGetNidList(@RequestParam(value = "id") String id);

    /**
     *  @RequestMapping("/hello")
     *     public String index() {
     *         return "hello  ，this is first messge";
     *     }
     */


}
