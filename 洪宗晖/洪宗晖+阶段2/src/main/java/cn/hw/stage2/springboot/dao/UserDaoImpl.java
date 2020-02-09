package cn.hw.stage2.springboot.dao;

import cn.edu.seu.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author: xuejing
 * @CreateTime: 2020-01-17 21:37
 * @Description: UserDao实现类
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer add(User user) {
        String sql = "insert into tbl_user(username,age,birthday,address) values(?,?,?,?)";
        return jdbcTemplate.update(sql,
                new Object[]{user.getUsername(),user.getAge(),user.getBirthday(),user.getAddress()});
    }

    @Override
    public Integer delete(Integer userId) {
        String sql = "delete from tbl_user where id = ?";
        return jdbcTemplate.update(sql,userId);
    }

    @Override
    public List queryAll() {
        String sql = "select * from tbl_user";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @Override
    public Integer update(User user, Integer userId) {
        String sql = "update tbl_user set username = ? where id = ?";
        return jdbcTemplate.update(sql,user.getUsername(),userId);
    }

}
