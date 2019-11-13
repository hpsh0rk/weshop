package com.sh0rk.demo.module1.service.model;

import lombok.Data;

/**
 * 前端获取的对象，数据传输对象，Service或Manager向外传输的对象。
 * @author sh0rk
 **/
@Data
public class UserDTO {
    private Integer id;
    private String username;
    private String passwor;
}
