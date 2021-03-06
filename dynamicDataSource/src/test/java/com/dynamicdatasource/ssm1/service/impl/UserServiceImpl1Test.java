package com.dynamicdatasource.ssm1.service.impl;

import com.dynamicdatasource.D1Application;
import com.dynamicdatasource.mybatisConfig.DatasourceConfig;
import com.dynamicdatasource.ssm1.domain.User1;
import com.dynamicdatasource.ssm1.service.UserService1;
import com.whh.service.UserDetailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest(classes = D1Application.class)
@RunWith(SpringRunner.class)
public class UserServiceImpl1Test {
    Logger logger = LoggerFactory.getLogger(UserServiceImpl1Test.class);
    //获取数据源
    /*@Resource(name = "dataSource1")
    DataSource datasource;
    @Autowired
    UserService1 userService1;*/
   @Autowired
    UserDetailService userDetailService;

    @Autowired
            @Qualifier("dataSource1")
    DataSource dataSource;

    /**
     * 测试数据源
     */
    @Test
    public void init(){
        System.out.println(dataSource);
    }
    /**
     * 测试Service
     */
    public void testService(){
        userDetailService.selectByPrimaryKey(123l);
    }
}