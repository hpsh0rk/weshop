package com.sh0rk.demo.module1.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 数据库对应的对象,与数据库表结构一一对应，通过DAO层向上传输数据源对象
 * @author sh0rk
 **/
@ApiModel("用户实体")
@Data
public class UserDO {
    @ApiModelProperty("用户id")
    private Integer id;
    @ApiModelProperty(value = "用户账户名",notes = "用户名需要满足正则匹配")
    private String username;
    @ApiModelProperty("用户密码")
    private String passwor;
}
