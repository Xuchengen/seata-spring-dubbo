package com.github.xuchengen.server.app.config;

import io.seata.spring.annotation.GlobalTransactionScanner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 作者：徐承恩
 * 邮箱：xuchengen@gmail.com
 * 日期：2019/12/19
 */
@Configuration
public class SeataAutoConfig {

    @Bean
    public GlobalTransactionScanner globalTransactionScanner() {
        return new GlobalTransactionScanner("dubbo-gts-seata-example", "my_test_tx_group");
    }

}
