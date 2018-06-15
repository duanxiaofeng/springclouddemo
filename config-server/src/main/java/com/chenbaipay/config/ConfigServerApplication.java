package com.chenbaipay.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Desc: config server
 * Created by dxf on 2018/6/6
 */
@Slf4j
@SpringBootApplication
@EnableEurekaClient  //注册到 eureka 服务中心
@EnableConfigServer  //表示为 config server
public class ConfigServerApplication {

    public static void main(String[] args) {
        log.info("--------config server A runing--------");
        SpringApplication.run(ConfigServerApplication.class, args);
    }

}
