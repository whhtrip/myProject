package com.dynamicdatasource.ssm2.service;

import com.dynamicdatasource.ssm2.domain.User2;

import java.util.List;

public interface UserService2 {
    List<User2> selectAll();
    int addUser(User2 user);
}
