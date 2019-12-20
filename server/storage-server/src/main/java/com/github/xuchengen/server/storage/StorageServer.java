package com.github.xuchengen.server.storage;

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
@MapperScan(basePackages = "com.github.xuchengen.server.storage.dao.mapper")
@EnableDubbo(scanBasePackages = "com.github.xuchengen.server.storage.facade")
@EnableTransactionManagement
public class StorageServer {

    public static void main(String[] args) {
        SpringApplication.run(StorageServer.class, args);
    }

}
