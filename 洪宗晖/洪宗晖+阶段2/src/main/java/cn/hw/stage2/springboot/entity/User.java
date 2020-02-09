package cn.hw.stage2.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.Date;

/**
 * @Author: xuejing
 * @CreateTime: 2020-01-17 21:33
 * @Description: 用户信息
 */

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;
    private String username;
    private Integer age;
    private String birthday;
    private String address;
}
