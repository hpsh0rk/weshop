package com.sh0rk.demo.module1.entity;

import lombok.Data;

/**
 * 数据库对应的对象,与数据库表结构一一对应，通过DAO层向上传输数据源对象
 * @author sh0rk
 **/
@Data
public class UserDO {
    private Integer id;
    private String username;
    private String passwor;
}
