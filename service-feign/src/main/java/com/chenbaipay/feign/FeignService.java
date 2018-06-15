package com.chenbaipay.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Desc: feign 调用
 * Created by dxf on 2018/6/6
 */
@FeignClient(value = "eureka-client", fallback = HystrixFallback.class)
public interface FeignService {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHello();
}
