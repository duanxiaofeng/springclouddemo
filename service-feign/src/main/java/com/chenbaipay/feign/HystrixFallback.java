package com.chenbaipay.feign;

import org.springframework.stereotype.Component;

/**
 * Desc: hystrix 熔断器
 * <p>实现feign的接口类，并@Component本类，在feign注解中添加 fallback 属性</p>
 * Created by dxf on 2018/6/7
 */
@Component
public class HystrixFallback implements FeignService{

    /**
     * sayHello 接口调用失败后，自动熔断至此方法,避免系统异常
     * @return
     */
    @Override
    public String sayHello() {
        return "sorry, this method is failed , please wait.....";
    }
}
