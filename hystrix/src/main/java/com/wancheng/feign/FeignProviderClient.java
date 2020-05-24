package com.wancheng.feign;

import com.wancheng.controller.FeignError;
import com.wancheng.entity.UserEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@FeignClient(value = "provider",fallback = FeignError.class)
public interface FeignProviderClient {

    @GetMapping("/user/findAll")
    Collection<UserEntity> findAll();

    @GetMapping("/user/index")
    String index();
}
