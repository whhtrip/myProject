package com.dynamicdatasource.ssm2.mapper;

import com.dynamicdatasource.ssm2.domain.User2;

import java.util.List;

public interface UserMapper2 {
    List<User2> selectAll();
    int addUser(User2 user);
}
