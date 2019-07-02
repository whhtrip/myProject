package com.ssm.service;

import com.ssm.SsmApplication;
import com.ssm.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SsmApplication.class)
public class UserServiceImplTest {
    @Autowired
    UserService userService;

    @Test
    public void insert() throws Exception {
        User user = new User("zagreb");
        userService.insert(user);
        System.out.println("test");
    }
}