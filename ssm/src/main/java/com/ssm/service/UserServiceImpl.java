package com.ssm.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.domain.User;
import com.ssm.mapper.UserMapper;
import com.ssm.pager.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
//@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public void insert(User user) throws Exception {
        userMapper.insert(user);
    }

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<User> selectAll() {
        Page<Object> page = PageHelper.startPage(1, 2);
        List<User> users = userMapper.selectAll();
        return users;
    }

    /**
     * 分页查询
     * @return
     */
    @Override
    public PageInfo<User> selectAllByPage() {
        Page<Object> page = PageHelper.startPage(1, 2);
        List<User> users = userMapper.selectAll();
        PageInfo<User> userPageInfo = new PageInfo<>(users);
        return userPageInfo;
    }

    @Override
    public Pager<User> selectByPage(Pager<User> pager) {
        return userMapper.selectByPage(pager);
    }
}
