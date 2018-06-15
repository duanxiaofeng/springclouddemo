package com.chenbaipay.feign;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Desc:
 * Created by dxf on 2018/6/6
 */
@Slf4j
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard //hystrix监控
@EnableCircuitBreaker   //hystrix监控
public class FeignApplication {

    public static void main(String[] args) {
        log.info("--------feign runing--------");
        SpringApplication.run(FeignApplication.class, args);
    }

}
