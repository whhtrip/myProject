package com.ssm.service;

import com.github.pagehelper.PageInfo;
import com.ssm.domain.User;
import com.ssm.pager.Pager;

import java.util.List;

public interface UserService {
    //插入一条数据
    void insert(User user) throws Exception;
    //查询所有
    List<User> selectAll();
    //分页查询
    PageInfo<User> selectAllByPage();
    Pager<User> selectByPage(Pager<User> pager);
}
