package com.spring.transaction.service.mapper;

import com.spring.transaction.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

//@MyBatisRepository
//@Mapper
@Repository
public interface UserMapper {
    void add1(User user);
}
