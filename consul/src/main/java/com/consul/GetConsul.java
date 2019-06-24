package com.consul;

import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.ConsulRawClient;
import com.ecwid.consul.v1.Response;
import com.ecwid.consul.v1.agent.model.Service;

import java.util.Map;

public class GetConsul {
    public static void getConsul(){
        ConsulRawClient consulRawClient = new ConsulRawClient();
        ConsulClient consulClient = new ConsulClient(consulRawClient);
        Response<Map<String, Service>> agentServices = consulClient.getAgentServices();
        System.out.println(agentServices);
    }
    public static void main(String[] args) {
        getConsul();
    }
}
