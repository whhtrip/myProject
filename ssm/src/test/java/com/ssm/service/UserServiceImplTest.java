package com.ssm.service;

import com.github.pagehelper.PageInfo;
import com.ssm.SsmApplication;
import com.ssm.domain.User;
import com.ssm.pager.Pager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SsmApplication.class)
public class UserServiceImplTest {
    @Autowired
    UserService userService;

    /**
     * 测试插入数据
     * @throws Exception
     */
    @Test
    public void insert() throws Exception {
        User user = new User("zagreb");
        userService.insert(user);
        System.out.println("test");
    }

    /**
     * 测试查询所有
     */
    @Test
    public void selectAll(){
        List<User> users = userService.selectAll();
        for (User user:users
             ) {
            System.out.println(user);
        }
    }

    /**
     * 分页查询
     */
    @Test
    public void selectByPage(){
        PageInfo<User> userPageInfo = userService.selectAllByPage();
        List<User> users = userPageInfo.getList();
        for (User user: users
             ) {
            System.out.println(user);
        }
    }
    @Test
    public void selectPager(){
        Pager<User> pager = new Pager<>();
        pager.setPageSize(2);
        pager.setPageNum(1);
        Pager<User> userPager = userService.selectByPage(pager);
        List<User> users = userPager.getList();
        for (User user: users
        ) {
            System.out.println(user);
        }
    }
}