package com.sh0rk.common.enums;

import com.sh0rk.common.code.BaseCode;
import lombok.Getter;

/**
 * 常用错误返回码
 * @author sh0rk
 **/
public enum CommonErrorCodeEnum implements BaseCode{
    /**
     * 请求参数有误
     */
    BAD_REQUEST(400,"请求参数有误"),

    /**
     * 未经授权
     */
    UNAUTHORIZED(401,"未经授权，请先获取Token"),

    /**
     * 没有权限
     */
    FORBIDDEN(403,"您没有权限访问这个资源"),

    /**
     * 没有找到该资源
     */
    NOT_FOUND(404,"NOT FOUND"),

    /**
     * 服务器错误
     */
    UNKNOWN_ERROR(500,"未知错误，请联系管理员"),
    ;

    @Getter
    private Integer code;
    @Getter
    private String message;

    CommonErrorCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
