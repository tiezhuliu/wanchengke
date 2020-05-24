package com.wancheng.controller;

import com.wancheng.entity.UserEntity;
import com.wancheng.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * 配置文件中开启feign的hystrix(熔断机制)
 * feign.hystrix.enabled: true
 * 需要实现Feign接口定义错误反馈
 * 并且配置fallback（降级处理）指定类
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<UserEntity> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中....";
    }
}
