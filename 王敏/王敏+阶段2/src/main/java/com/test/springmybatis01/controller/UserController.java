package com.test.springmybatis01.controller;

import com.alibaba.druid.stat.DruidStatManagerFacade;
import com.test.springmybatis01.entity.User;
import com.test.springmybatis01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getAll")
    public List<User> getAll(){
        List<User> listall = new ArrayList<>();
        listall = userService.getAll();
        return listall;
    }
    @RequestMapping("/getUserById/{id}")
    public List<User> getUserById(@PathVariable("id") Integer id) {
        List<User> list = new ArrayList<>();
        list = userService.getUserById(id);
        return list;
    }

    @RequestMapping("/deleteUserById/{id}")
    public void deleteUserById(@PathVariable("id") Integer id) {
        userService.deleteUserById(id);
    }

    @RequestMapping("/updateUser")
    public  int updateUser(User user) {
        return userService.updateUser(user);
    }

    @RequestMapping("/insertUser")
    public  int insertUser(User user){
        return userService.insertUser(user);
    }

    @GetMapping("/druid/stat")
    public Object druidStat() {
        // DruidStatManagerFacade#getDataSourceStatDataList
        //该方法可以获取所有数据源的监控数据，
        //除此之外 DruidStatManagerFacade 还提供了一些其他方法，你可以按需选择使用。
        return DruidStatManagerFacade.getInstance().getDataSourceStatDataList();
    }

    @RequestMapping("/test")
    public String test(){
        return "测试成功";
    }
}
