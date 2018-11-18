package com.huju.consumeruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by huju on 2018/11/18.
 */
@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/buy")
    public String buyTicket(String name) {
        /**
         * PROVIDER-TICKET 是服务提供方的名字
         * ticket 是你要调的方法
         */
        String forObject = restTemplate.getForObject("http://provider-ticket/ticket", String.class);
        return name + "购买了" + forObject;
    }
}
