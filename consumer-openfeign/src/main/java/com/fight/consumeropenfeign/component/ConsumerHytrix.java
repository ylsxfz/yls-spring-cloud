package com.fight.consumeropenfeign.component;

import com.fight.consumeropenfeign.service.ConsumerService;
import org.springframework.stereotype.Component;

/**
 * @Auther: yls
 * @Date: 2020/12/30 14:08
 * @Description:
 * @Version 1.0
 */
@Component
public class ConsumerHytrix implements ConsumerService {

    @Override
    public String helloNacos(Integer id) {
        return "请求超时了！！！";
    }
}
