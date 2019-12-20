package com.github.xuchengen.server.order;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 作者：徐承恩
 * 邮箱：xuchengen@gmail.com
 * 日期：2019/12/17
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableDubbo(scanBasePackages = "com.github.xuchengen.server.order.facade")
@MapperScan(basePackages = "com.github.xuchengen.server.order.dao.mapper")
public class OrderServer {

    public static void main(String[] args) {
        SpringApplication.run(OrderServer.class, args);
    }

}
