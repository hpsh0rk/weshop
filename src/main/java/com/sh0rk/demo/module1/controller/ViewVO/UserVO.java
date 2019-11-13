package com.sh0rk.demo.module1.controller.ViewVO;

import lombok.Data;

/**
 * 返回到前端的对象,显示层对象，通常是Web向模板渲染引擎层传输的对象。
 * @author sh0rk
 **/
@Data
public class UserVO {
    private Integer Id;
    private String username;

    public UserVO(Integer id, String username) {
        Id = id;
        this.username = username;
    }
}
