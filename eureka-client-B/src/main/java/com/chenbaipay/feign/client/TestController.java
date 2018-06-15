package com.chenbaipay.feign.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc:
 * Created by dxf on 2018/6/6
 */
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello, i from eureka-client-B  , port : " + port;
    }

}
