package com.atguigu.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PaymentMian8006
 * @Description TODO
 * @Author Administrator
 * @Date 2021/11/17 0017 8:31
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class PaymentMian8006 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMian8006.class,args);
    }
}
