package com.springcolud.serverribbon.remote;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author haochen
 * @date 2019/9/16 10:12
 */
@Service
public class HelloServer {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String getInfo(String id){
        return restTemplate.getForObject("http://SPRING-CLOUD-PRODUCER/getInfo?id="+id,String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",requests,error!";
    }
}
