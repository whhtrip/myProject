package com.ssm.mapper;

import com.ssm.domain.User;
import com.ssm.pager.Pager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    //@Insert("insert into whh values(\"张飞\")")
    void insert(User user);
    List<User> selectAll();

    Pager<User> selectByPage(Pager<User> pager);
}
