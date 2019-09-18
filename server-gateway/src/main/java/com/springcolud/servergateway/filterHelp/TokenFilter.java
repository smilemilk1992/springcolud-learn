package com.springcolud.servergateway.filterHelp;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;

/**
 * 全局过滤器
 * @author haochen
 * @date 2019/9/18 17:51
 */
public class TokenFilter implements GlobalFilter,Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        boolean token = exchange.getRequest().getQueryParams().containsKey("token");
        System.out.println("------"+token);
        if (!token) {
            System.out.println( "token is empty..." );
            byte[] bytes = "{\"status\":\"401\",\"msg\":\"UNAUTHORIZED\"}".getBytes(StandardCharsets.UTF_8);
            DataBuffer buffer = exchange.getResponse().bufferFactory().wrap(bytes);
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            return exchange.getResponse().writeWith(Flux.just(buffer));
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 10;
    }
}
