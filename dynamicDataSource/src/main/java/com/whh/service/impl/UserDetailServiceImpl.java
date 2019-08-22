package com.whh.service.impl;

import com.whh.dao.UserdetailMapper;
import com.whh.entity.Userdetail;
import com.whh.entity.UserdetailExample;
import com.whh.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:WangHongHao
 * @date:19-8-22创建
 * @date：修改
 * @description：
 */
@Service
public class UserDetailServiceImpl implements UserDetailService {
   //@Autowired
    UserdetailMapper userdetailMapper;
    @Override
    public int countByExample(UserdetailExample example) {
        return userdetailMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UserdetailExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Long userdetailId) {
        return 0;
    }

    @Override
    public int insert(Userdetail record) {
        return 0;
    }

    @Override
    public int insertSelective(Userdetail record) {
        return 0;
    }

    @Override
    public List<Userdetail> selectByExample(UserdetailExample example) {
        return null;
    }

    @Override
    public Userdetail selectByPrimaryKey(Long userdetailId) {
        System.out.println("mapper:"+userdetailMapper);
        //return userdetailMapper.selectByPrimaryKey(userdetailId);
        return null;
    }

    @Override
    public int updateByExampleSelective(Userdetail record, UserdetailExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Userdetail record, UserdetailExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Userdetail record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Userdetail record) {
        return 0;
    }
}
