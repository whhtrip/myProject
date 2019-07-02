package com.ssm.service;

import com.ssm.domain.User;
import com.ssm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public void insert(User user) throws Exception {
        userMapper.insert(user);
        userMapper.insert(user);
        userMapper.insert(user);
        userMapper.insert(user);
    }
}
