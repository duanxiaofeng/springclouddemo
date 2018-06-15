package com.chenbaipay.zuul;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Desc: zuul 调度
 * Created by dxf on 2018/6/6
 */
@Slf4j
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy //注解整合了@EnableCircuitBreaker、@EnableDiscoveryClient
public class ZuulApplication {

    public static void main(String[] args) {
        log.info("--------zuul runing--------");
        SpringApplication.run(ZuulApplication.class, args);
    }

}
