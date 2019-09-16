package com.springcolud.consumer1.remote;

import org.springframework.beans.factory.annotation.Autowired;
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

    public String getInfo(String id){
        return restTemplate.getForObject("http://SPRING-CLOUD-PRODUCER/getInfo?id="+id,String.class);
    }
}
