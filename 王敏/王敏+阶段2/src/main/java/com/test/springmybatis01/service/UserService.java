package com.test.springmybatis01.service;

import com.test.springmybatis01.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface UserService {
    List<User> getAll();
    List<User> getUserById( Integer id);
    int updateUser(User user);
    void deleteUserById(Integer id);
    int insertUser(User user);
}
