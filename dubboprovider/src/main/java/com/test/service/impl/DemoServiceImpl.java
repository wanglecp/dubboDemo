package com.test.service.impl;

import com.alibaba.dubbo.rpc.RpcContext;
import java.util.Date;
import java.text.SimpleDateFormat;
import com.test.service.DemoService;

public class DemoServiceImpl implements DemoService{
    public String sayHello(String name) {

        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello "
                + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());

        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }
}
