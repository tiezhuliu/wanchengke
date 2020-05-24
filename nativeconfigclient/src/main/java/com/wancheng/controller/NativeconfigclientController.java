package com.wancheng.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/native")
public class NativeconfigclientController {

    @Value("${foo}")
    String foo;

    @Value("${server.port}")
    String port;

    @GetMapping("index")
    String index(){
        return port+"==="+foo;
        }
}
