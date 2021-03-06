package com.whh.service;

import com.whh.entity.Userdetail;
import com.whh.entity.UserdetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDetailService {
    int countByExample(UserdetailExample example);

    int deleteByExample(UserdetailExample example);

    int deleteByPrimaryKey(Long userdetailId);

    int insert(Userdetail record);

    int insertSelective(Userdetail record);

    List<Userdetail> selectByExample(UserdetailExample example);

    Userdetail selectByPrimaryKey(Long userdetailId);

    int updateByExampleSelective(@Param("record") Userdetail record, @Param("example") UserdetailExample example);

    int updateByExample(@Param("record") Userdetail record, @Param("example") UserdetailExample example);

    int updateByPrimaryKeySelective(Userdetail record);

    int updateByPrimaryKey(Userdetail record);
}
