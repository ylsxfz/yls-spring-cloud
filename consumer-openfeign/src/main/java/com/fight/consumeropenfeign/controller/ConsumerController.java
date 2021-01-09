package com.fight.consumeropenfeign.controller;

import com.fight.consumeropenfeign.service.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: yls
 * @Date: 2020/12/30 10:16
 * @Description: 测试controller
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/consumer")
public class ConsumerController {

    @Resource
    private ConsumerService consumerService;

    @GetMapping(value = "/openfeign/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Integer id){
        return consumerService.helloNacos(id);
    }

}
