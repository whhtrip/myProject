package com.dynamicdatasource.ssm1.service;

import com.dynamicdatasource.ssm1.domain.User1;

import java.util.List;

public interface UserService1 {
    List<User1> selectAll();
    int addUser(User1 user);
}
