package com.wancheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @EnableConfigServer
 * 声明配置中心
 */
@SpringBootApplication
@EnableConfigServer
public class NativeconfigserverApplication {
    public static void main(String[] args) {
        SpringApplication.run(NativeconfigserverApplication.class,args);
    }
}
