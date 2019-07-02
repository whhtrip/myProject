package com.ssm.mapper;

import com.ssm.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

//@Repository
public interface UserMapper {
    //@Insert("insert into whh values(\"张飞\")")
    void insert(User user);
}
