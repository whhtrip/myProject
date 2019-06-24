package com.consul.controller;

import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.agent.model.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 通过consul获取注册服务的ip信息
 */
@RestController
@RequestMapping("consul")
public class ConsulController {
    @Autowired
    DiscoveryClient discoveryClient;
    @RequestMapping("getConsulServiceName")
    public List<String> getConsulServiceName(){
        List<String> services = discoveryClient.getServices();
        String cs = discoveryClient.description();
        System.out.println(cs);
        System.out.println(discoveryClient.getServices());
        return services;
    }
    @RequestMapping("getConsul")
    public Object getConsul(){
        System.out.println("开始获取consul服务");
        ConsulClient consul = new ConsulClient();
       Set<Map.Entry<String,Service>> cs= consul.getAgentServices().getValue().entrySet();
       Iterator<Map.Entry<String,Service>> iterable = cs.iterator();
       while(iterable.hasNext()){
           Map.Entry<String,Service> serviceMap = iterable.next();
         //  iterable.next().getValue().getId();
           String key = serviceMap.getKey();
           String service = serviceMap.getValue().getService();
         String id =serviceMap.getValue().getId();
        String address = serviceMap.getValue().getAddress();
           System.out.println(key+"  "+id+"  "+address+"  "+service);
       }
        return cs;
    }

    @RequestMapping("get")
    public String get(){
        return "asfdsf";
}
}
