package com.sh0rk.demo.module1.enums;

import com.sh0rk.common.code.BaseCode;
import lombok.Getter;

/**
 * @author sh0rk
 **/
public enum DemoUserCodeEnum implements BaseCode {
    //1000开头表示为用户信息相关错误定义
    USER_NOT_EXIST(1001, "用户不存在"),
    USER_LOGIN_FAIL(1002, "用户手机号或密码不正确"),
    USER_NOT_LOGIN(1003, "用户还未登录"),
    ;
    @Getter
    private Integer code;
    @Getter
    private String message;

    DemoUserCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
