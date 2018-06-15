package com.chenbaipay.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc:
 * Created by dxf on 2018/6/7
 */
@RestController
@RefreshScope  // cmd curl -X POST http://localhost:8002/refresh 刷新参数
public class TestController {

    @Value("${filename}")
    String filename;


    @RequestMapping(value = "/get")
    public String getByConfigServer() {
        return this.filename;
    }
}
