package com.spring.transaction.service.impl;

import com.spring.DemoApplication;
import com.spring.transaction.domain.User;
import com.spring.transaction.service.UserService;
import com.spring.transaction.service.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class UserServiceImplTest {
    @Autowired
    UserService userService;

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void add() {
        User user = new User("张飞");
        userService.add(user);
        String applicationName = applicationContext.getApplicationName();
        System.out.println(applicationName);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String s : beanDefinitionNames
        ) {
            System.out.println(s);
        }
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        userMapper.add1(user);
    }
}