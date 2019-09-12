package com.springcolud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务发现注册（Eureka）
 * 客户端负载均衡（Ribbon）
 * 断路器（Hystrix）
 * 智能路由（Zuul）
 * 服务开发 　　　　　　　　　　　　Springboot、Spring、SpringMVC
 *
 * 服务配置与管理 　　　　　　　　Netflix公司的Archaius、阿里的Diamond等
 *
 * 服务注册与发现 　　　　　　　　Eureka、Consul、Zookeeper等
 *
 * 服务调用 　　　　　　　　　　　　Rest、RPC、gRPC
 *
 * 服务熔断器 　　　　　　　　　　Hystrix、Envoy等
 *
 * 负载均衡 　　　　　　　　　　　　Ribbon、Nginx等
 *
 * 服务接口调用(客户端调用服务的简化工具)Feign等
 *
 * 消息队列 　　　　　　　　　　　　Kafka、RabbitMQ、ActiveMQ等
 *
 * 服务配置中心管理 　　　　　　　　SpringCloudConfig、Chef等
 *
 * 服务路由（API网关） 　　　　　　Zuul等
 *
 * 服务监控　　　　　　　　　　　Zabbix、Nagios、Metrics、Spectator等
 *
 * 全链路追踪　　　　　　　　　　Zipkin，Brave、Dapper等
 *
 * 服务部署 　　　　　　　　　　　　Docker、OpenStack、Kubernetes等
 *
 * 数据流操作开发包 　　　　　　　　SpringCloud Stream（封装与Redis,Rabbit、Kafka等发送接收消息）
 *
 * 事件消息总线 　　　　　　　　　　Spring Cloud Bus
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

}
