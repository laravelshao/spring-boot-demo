package com.laravelshao.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shaoqinghua on 2018/1/19.
 */
@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world !!!!";
    }
}
