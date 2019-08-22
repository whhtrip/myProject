package com.dynamicdatasource.ssm1.service.impl;

import com.dynamicdatasource.ssm1.domain.User1;

import com.dynamicdatasource.ssm1.mapper.UserMapper;
import com.dynamicdatasource.ssm1.service.UserService1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


//@Service
//@Transactional(transactionManager = "dataSourceTransactionManager")
public class UserServiceImpl1 implements UserService1 {
    Logger logger = LoggerFactory.getLogger(UserService1.class);

   // @Autowired
    UserMapper userMapper1;

    @Override
    //@DataSource(value = "dataSource1")
    public List<User1> selectAll() {
        logger.info("UserMapper1=" + userMapper1);
        return userMapper1.selectAll();
    }

    @Override
    //@DataSource(value = "dataSource2")
    public int addUser(User1 user) {
        logger.info("UserMapper1=" + userMapper1);
        logger.info("User=" + user);
        int i = userMapper1.addUser(user);
        //i = i / 0;
        return i;
    }
}
