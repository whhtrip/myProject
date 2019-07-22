package com.dynamicdatasource.ssm2.service.impl;

import com.dynamicdatasource.ssm2.domain.User2;
import com.dynamicdatasource.ssm2.mapper.UserMapper2;
import com.dynamicdatasource.ssm2.service.UserService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



public class UserServiceImpl2 implements UserService2 {

    @Override
    public List<User2> selectAll() {
        return null;
    }

    @Override
    public int addUser(User2 user) {
        return 0;
    }
}
