package com.whh.service.impl;

import com.dynamicdatasource.D1Application;
import com.whh.service.UserDetailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@SpringBootTest(classes = D1Application.class)
@RunWith(SpringRunner.class)
public class UserDetailServiceImplTest {
    Logger logger = LoggerFactory.getLogger(UserDetailServiceImplTest.class);

    @Autowired
    UserDetailService userDetailService;

    /**
     * 测试Service
     */
    public void testService(){

    }
    @Test
    public void selectByPrimaryKey() {
        userDetailService.selectByPrimaryKey(123l);
    }
}