package com.springcolud.serverzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 2.0.8版本可以，但是2.1.0不行
 * 路由在微服务架构的一个组成部分。 例如，/可以映射到您的Web应用程序，/ api / users映射到用户服务，并且/ api / shop映射到商店服务。 Zuul是Netflix的基于JVM的路由器和服务器端负载均衡器。
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
public class ServerZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerZuulApplication.class, args);
    }

}
