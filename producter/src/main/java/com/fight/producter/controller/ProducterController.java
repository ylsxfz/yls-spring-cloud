package com.fight.producter.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: yls
 * @Date: 2020/12/30 10:03
 * @Description: 生成者的控制器
 * @Version 1.0
 */
@RestController
public class ProducterController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/producter/nacos/{id}")
    public String getPayMent(@PathVariable("id") Integer id){
        return "nacos registry, serverPort: " + serverPort + "\t id =》" + id;
    }
}
