package com.thrift.server;

import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.util.List;
import java.util.Map;

public interface ThriftServer {
    void say();
    String getName();
    User getUser();
    List<User> getALl();
    Map<String,Integer> getAgeByName();


}
