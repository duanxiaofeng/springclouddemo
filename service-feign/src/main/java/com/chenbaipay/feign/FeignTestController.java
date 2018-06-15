package com.chenbaipay.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc:
 * Created by dxf on 2018/6/6
 */
@RestController
public class FeignTestController {
    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "/feign/hello")
    public String sayHello() {
        return feignService.sayHello();
    }
}
