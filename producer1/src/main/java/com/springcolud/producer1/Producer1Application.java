package com.springcolud.producer1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @EnableDiscoveryClient基于spring-cloud-commons,@EnableEurekaClient基于spring-cloud-netflix。
 * 其实用更简单的话来说，就是如果选用的注册中心是eureka，那么就推荐@EnableEurekaClient，如果是其他的注册中心，那么推荐使用@EnableDiscoveryClient。
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进Eureka服务中
@EnableDiscoveryClient //服务发现
@MapperScan("com.springcolud.producer1.Mapper")
public class Producer1Application {

    public static void main(String[] args) {
        SpringApplication.run(Producer1Application.class, args);
    }

}
