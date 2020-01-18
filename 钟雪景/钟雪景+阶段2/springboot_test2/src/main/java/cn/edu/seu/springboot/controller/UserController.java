package cn.edu.seu.springboot.controller;

import cn.edu.seu.springboot.dao.UserDao;
import cn.edu.seu.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author: xuejing
 * @CreateTime: 2020-01-17 21:25
 * @Description: 用户 Controller
 */

@Controller
public class UserController {

    @Autowired
    UserDao userDao;

    @ResponseBody
    @GetMapping("/query")
    public String query(){
        // 查询信息
        List list = userDao.queryAll();
        System.out.println("查询所有的信息："+ list);
        return list.toString();
    }

    @ResponseBody
    @GetMapping("/add")
    public int add(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = df.format(new Date());
        User user = new User(null,"你好",15,currentDate,"安徽");
        return userDao.add(user);
    }

    @ResponseBody
    @GetMapping("/delete")
    public int delete(){
        return userDao.delete(2);
    }

    @ResponseBody
    @GetMapping("/update")
    public int update(){
        User user = new User();
        user.setUsername("李明");
        return userDao.update(user,2);
    }
}
