package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @ClassName MySelfRule
 * @Description TODO
 * @Author Administrator
 * @Date 2021/11/17 0017 9:03
 * @Version 1.0
 **/
@Component
public class MySelfRule {

    @Bean
    public IRule getIRule(){
        return new RandomRule();
    }

}
