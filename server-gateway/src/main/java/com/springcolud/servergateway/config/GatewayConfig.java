package com.springcolud.servergateway.config;

import com.springcolud.servergateway.filterHelp.TokenFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author haochen
 * @date 2019/9/18 17:53
 */
@Configuration
public class GatewayConfig {
    @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }
}
