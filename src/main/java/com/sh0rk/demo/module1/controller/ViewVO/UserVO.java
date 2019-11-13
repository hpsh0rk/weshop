package com.sh0rk.demo.module1.controller.ViewVO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 返回到前端的对象,显示层对象，通常是Web向模板渲染引擎层传输的对象。
 * @author sh0rk
 **/
@ApiModel("用户VO")
@Data
public class UserVO {
    @ApiModelProperty("用户id")
    private Integer Id;
    @ApiModelProperty(value = "用户账户名",notes = "用户名需要满足正则匹配")
    private String username;

    public UserVO(Integer id, String username) {
        Id = id;
        this.username = username;
    }
}
