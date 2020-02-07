package com.test.springmybatis01.mapper;

import com.test.springmybatis01.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> getAll();
    List<User> getUserById(Integer id);
    int updateUser(User user);
    void deleteUserById(Integer id);
    int insertUser(User user);
}
