package com.dynamicdatasource.ssm1.service.impl;

import com.dynamicdatasource.D1Application;
import com.dynamicdatasource.ssm1.domain.User1;
import com.dynamicdatasource.ssm1.service.UserService1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Resource(name = "dataSource1")
    DataSource datasource;
    @Autowired
    UserService1 userService1;

    @Test
    public void selectAll() {
        logger.info("开始查询所有");
        List<User1> user1s = userService1.selectAll();
        System.out.println(user1s);
    }

    @Test
    public void getDataSource() throws SQLException {
        System.out.println(datasource);
        Connection connection = datasource.getConnection();
        System.out.println(connection);
    }

    @Test
    public void addUser() {
        User1 user = new User1("123dsfsdfs");
        userService1.addUser(user);
    }
}