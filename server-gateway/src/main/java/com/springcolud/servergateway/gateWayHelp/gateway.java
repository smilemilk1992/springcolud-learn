package com.springcolud.servergateway.gateWayHelp;

import com.springcolud.servergateway.filterHelp.RequestTimeFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;
import java.util.Date;


/**
 * @author haochen
 * @date 2019/9/17 11:12
 */
@Configuration
public class gateway {

//    /**
//     * 当请求头中的Host为*.hystrix.com，进入此路由，然后再过滤器中，设置Hystrix熔断，当请求超时时，请求转发到Gateway中的“/fallback”
//     * @param builder
//     * @return
//     */
//    @Bean
//    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
//        String httpUri = "http://httpbin.org:80";
//        return builder.routes()
//                .route(p -> p
//                        .path("/get")
//                        .filters(f -> f.filter(new RequestTimeFilter()).addRequestHeader("Hello", "World"))
//                        .uri(httpUri))
//                .route(p -> p
//                        .host("*.hystrix.com")
//                        .filters(f -> f
//                                .hystrix(config -> config
//                                        .setName("mycmd")
//                                        .setFallbackUri("forward:/fallback")))
//                        .uri(httpUri))
//                .build();
//    }
//
//
//    /**
//     * 请求：http://127.0.0.1:9010/about 跳转到https://smilemilk1992.github.io/about
//     * @param builder
//     * @return
//     */
//    @Bean
//    public RouteLocator routeLocator1(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("blog", r -> r.path("/about")
//                        .uri("https://smilemilk1992.github.io"))
//                .build();
//    }
//
//
//    /**
//     * 通过时间匹配，before 在指定时间之前的都进行转发
//     * @param builder
//     * @return
//     */
//    @Bean
//    public RouteLocator routeLocator2(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("before_route", r -> r.before(ZonedDateTime.now())
//                        .uri("https://smilemilk1992.github.io"))
//                .build();
//    }
//
//    /**
//     * 通过时间匹配，after 在指定时间之后的都进行转发
//     * @param builder
//     * @return
//     */
//    @Bean
//    public RouteLocator routeLocator3(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("after_route", r -> r.after(ZonedDateTime.now())
//                        .uri("https://smilemilk1992.github.io"))
//                .build();
//    }
//
//
//    /**
//     * 一个是 Cookie name ,一个是正则表达式，路由规则会通过获取对应的 Cookie name 值和正则表达式去匹配，如果匹配上就会执行路由，如果没有匹配上则不执行
//     * 通过cookie进行匹配
//     * @param builder
//     * @return
//     */
//    @Bean
//    public RouteLocator routeLocator5(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("cookie_route", r -> r.cookie("ityouknow","\\d+")
//                        .uri("https://smilemilk1992.github.io"))
//                .build();
//    }
//
//
//    /**
//     * 通过header属性匹配
//     * @param builder
//     * @return
//     */
//    @Bean
//    public RouteLocator routeLocator6(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("header_route", r -> r.header("ityouknow","\\d+")
//                        .uri("https://smilemilk1992.github.io"))
//                .build();
//    }
//
//
//    /**
//     * 通过host进行匹配
//     * @param builder
//     * @return
//     */
//    @Bean
//    public RouteLocator routeLocator7(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("host_route", r -> r.host("smilemilk*")
//                        .uri("https://smilemilk1992.github.io"))
//                .build();
//    }
//
//    /**
//     * 通过请求方式进行匹配
//     * @param builder
//     * @return
//     */
//    @Bean
//    public RouteLocator routeLocator8(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("method_route", r -> r.method("GET")
//                        .uri("https://smilemilk1992.github.io"))
//                .build();
//    }
//
//    /**
//     * 通过请求路径来进行匹配 http:127.0.0.1:9010/foo/about --> https://smilemilk1992.github.io/about/
//     * @param builder
//     * @return
//     */
//    @Bean
//    public RouteLocator routeLocator9(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("add_route", r -> r.path("/foo/{segment}")
//                        .filters(f->f.rewritePath("/foo/(?<segment>.*)","/$\\{segment}"))
//                        .uri("https://smilemilk1992.github.io"))
//                .build();
//    }
//
//
//    /**
//     * 通过请求参数进行匹配
//     * @param builder
//     * @return
//     */
//    @Bean
//    public RouteLocator routeLocator10(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("query_route", r -> r.query("smile")
//                        .uri("https://smilemilk1992.github.io"))
//                .build();
//    }
//
//    /**
//     * 通过ip地址进行匹配
//     * @param builder
//     * @return
//     */
//    @Bean
//    public RouteLocator routeLocator11(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("ipadd_route", r -> r.remoteAddr("127.0.0.1")
//                        .uri("http://10.18.38.122:8085/query/getinfo?type=0&oid=362838048&nid=on"))
//                .build();
//    }


    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder builder) {
        // @formatter:off
        return builder.routes()
                .route(r -> r.path("/forezp/**")
                        .filters(f -> f.filter(new RequestTimeFilter())
                                .addResponseHeader("chen", "hao"))
                        .uri("https://blog.csdn.net")
                        .order(0)
                        .id("customer_filter_router")
                )
                .build();
        // @formatter:on
    }

    @Bean
    public RouteLocator routeLocator10(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("query_route", r -> r.query("token")
                        .uri("https://blog.csdn.net").order(10))
                .build();
    }

    @Bean
    public RouteLocator routeLocator101(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("limit_route", r -> r.path("/*")
                        .filters()
                        .uri("http://127.0.0.1:9010"))
                .build();
    }

}
