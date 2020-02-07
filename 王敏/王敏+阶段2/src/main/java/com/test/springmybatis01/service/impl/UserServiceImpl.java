package com.test.springmybatis01.service.impl;

import com.test.springmybatis01.entity.User;
import com.test.springmybatis01.mapper.UserMapper;
import com.test.springmybatis01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getAll(){
        return userMapper.getAll();
    }

    @Override
    public List<User> getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        userMapper.deleteUserById(id);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }
}
