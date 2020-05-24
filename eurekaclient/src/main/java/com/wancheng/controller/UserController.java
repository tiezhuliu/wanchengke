package com.wancheng.controller;


import com.wancheng.entity.UserEntity;
import com.wancheng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${server.port}")    //@Value 读取配置文件信息
    private String port;

    @Autowired
    UserService userService;

    @GetMapping("findAll")
    public Collection<UserEntity> findAll(){
        return userService.findAll();
    }

    @GetMapping("findById/{id}/{name}")
    public UserEntity findById(@PathVariable("id") Long id,@PathVariable("name") String name){
        System.out.println(id+"==="+name);
        return userService.findById(id);
    }

    @GetMapping("index")
    public String index(){
        return "当前服务端口："+port;
    }

//    @PutMapping
//    @DeleteMapping
}
