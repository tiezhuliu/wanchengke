package com.wancheng.controller;

import com.wancheng.entity.UserEntity;
import com.wancheng.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    FeignProviderClient feignProviderClient;

    @RequestMapping("findAll")
    public Collection<UserEntity> findAll(){
        return feignProviderClient.findAll();
    }

    @RequestMapping("index")
    String index(){
        return feignProviderClient.index();
    }
}
