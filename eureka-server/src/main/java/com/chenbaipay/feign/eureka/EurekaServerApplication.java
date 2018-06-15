package com.chenbaipay.feign.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Desc:
 * Created by dxf on 2018/6/6
 */
@Slf4j
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        log.info("-------eureka-server runing--------");
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
