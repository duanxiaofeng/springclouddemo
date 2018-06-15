package com.chenbaipay.feign.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc:
 * Created by dxf on 2018/6/6
 */
@Slf4j
@RestController
@SpringBootApplication
public class SpringBootApp {


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        log.info("--------springboot runing now--------");
        return "spring boot test success !";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class, args);
    }

}
