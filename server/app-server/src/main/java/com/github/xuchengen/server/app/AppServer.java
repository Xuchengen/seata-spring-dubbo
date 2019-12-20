package com.github.xuchengen.server.app;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 作者：徐承恩
 * 邮箱：xuchengen@gmail.com
 * 日期：2019/12/17
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.github.xuchengen.server.app")
@ServletComponentScan
public class AppServer {

    public static void main(String[] args) {
        SpringApplication.run(AppServer.class, args);
    }

}
