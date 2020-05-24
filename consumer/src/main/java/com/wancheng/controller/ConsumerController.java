package com.wancheng.controller;

import com.wancheng.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

//    @GetMapping("/findAll")
//    public Collection<UserEntity> findAll(){
//        return restTemplate.getForEntity("http://localhost:8010/user/findAll",Collection.class).getBody();
//    }

    @GetMapping("/findAll")
    public Collection<UserEntity> findAll(){
        return restTemplate.getForObject("http://localhost:8010/user/findAll",Collection.class);
    }


//    @GetMapping("findById/{id}")
//    public UserEntity findById(@PathVariable("id") Long id){
//        return restTemplate.getForObject("http://localhost:8010/user/findById/{id}",UserEntity.class,id);
//    }



    @GetMapping("findById/{id}/{name}")
    public UserEntity findById(@PathVariable("id") Long id, @PathVariable("name") String name){
        return restTemplate.getForObject("http://localhost:8010/user/findById/{id}/{name}",UserEntity.class,id,name);
    }


}
