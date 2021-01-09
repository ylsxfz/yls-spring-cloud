package com.fight.consumeropenfeign.service;

import com.fight.consumeropenfeign.component.ConsumerHytrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 客户端调用
 */
@FeignClient(name = "producter",fallback = ConsumerHytrix.class)
public interface ConsumerService {

    @GetMapping("producter/nacos/{id}")
    String helloNacos(@PathVariable("id") Integer id);
}
