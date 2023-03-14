package com.shihang.oneservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author juanxincai
 * @creat 2023/3/14-10:42
 */

@RestController //控制器注解
public class HelloController {
    //http://域名:8080/path(即hello)
    @GetMapping("/hello") //表示可以接收web的get请求
    public String hello()
        {
            return "HelloWorld";
        }
}
