package com.wancheng.controller;

import com.wancheng.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("ribbon")
public class RibbonController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("findAll")
    public Collection<UserEntity> findAll(){
        return restTemplate.getForObject("http://provider/user/findAll",Collection.class);
    }

    @RequestMapping("index")
    public String index(){
        return restTemplate.getForObject("http://provider/user/index",String.class);
    }
}
