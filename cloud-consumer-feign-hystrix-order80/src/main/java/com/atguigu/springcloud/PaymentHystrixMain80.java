package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName PaymentHystrixMain80
 * @Description TODO
 * @Author Administrator
 * @Date 2021/11/17 0017 20:08
 * @Version 1.0
 **/
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class PaymentHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain80.class,args);
    }
}
