package com.spring.transaction.service.impl;

import com.spring.transaction.domain.User;
import com.spring.transaction.service.UserService;
import com.spring.transaction.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public void add(User user) {
        userMapper.add1(user);
    }
}
