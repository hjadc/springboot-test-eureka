package com.huju.testEureka.service;

import org.springframework.stereotype.Service;

/**
 * Created by huju on 2018/11/18.
 */
@Service
public class TicketService {

    public String getTicket() {
        System.out.println("************ 这是8002的服务 *************");
        return "8002服务-哈哈哈... 厉害了!";
    }
}
