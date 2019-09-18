package com.springcolud.servergateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * 版本必须是2.1.0 Greenwich.M3不然报错  或者2.0.6 Finchley
 */
@RestController
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ServerGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerGatewayApplication.class, args);
    }
    // tag::fallback[]
//    @RequestMapping("/fallback")
//    public Mono<String> fallback() {
//        return Mono.just("fallback");
//    }
    // end::fallback[]

//    @RequestMapping("/hello/world")
//    public String index() {
//        return "hello1  world，";
//    }

    @RequestMapping("fallback")
    public String fallback() {
        return "Hello,Hystrix fallback";
    }



}
