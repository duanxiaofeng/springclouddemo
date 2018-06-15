package com.chenbaipay.config.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Desc: config client
 * Created by dxf on 2018/6/6
 */
@Slf4j
@SpringBootApplication
@EnableEurekaClient  //注册到 eureka 服务中心
public class ConfigClientApplication {

    public static void main(String[] args) {
        log.info("--------config client runing--------");
        SpringApplication.run(ConfigClientApplication.class, args);
    }

}
