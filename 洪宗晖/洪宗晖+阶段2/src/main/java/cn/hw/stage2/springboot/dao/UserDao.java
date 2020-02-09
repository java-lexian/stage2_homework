package cn.hw.stage2.springboot.dao;

import cn.edu.seu.springboot.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: xuejing
 * @CreateTime: 2020-01-17 21:30
 * @Description: UserDao接口
 */

public interface UserDao {

    /**
     * 添加用户
     * @param user
     * @return
     */
    Integer add(User user);

    /**
     * 删除用户
     * @param userId
     * @return
     */
    Integer delete(Integer userId);

    /**
     * 查询所有用户
     * @return
     */
    List queryAll();

    /**
     * 更新用户
     * @param user
     * @param userId
     * @return
     */
    Integer update(User user,Integer userId);
}
