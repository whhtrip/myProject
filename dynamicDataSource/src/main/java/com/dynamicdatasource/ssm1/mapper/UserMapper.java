package com.dynamicdatasource.ssm1.mapper;


import com.dynamicdatasource.ssm1.domain.User1;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User1> selectAll();
    int addUser(User1 user);
}
