package com.sh0rk.common.enums;

import com.sh0rk.common.code.BaseCode;
import lombok.Getter;

/**
 * 常用返回码
 * @author sh0rk
 **/
public enum CommonCodeEnum implements BaseCode{
    /**
     * 成功
     */
    SUCCESS(200,"OK"),
    ;

    @Getter
    private Integer code;
    @Getter
    private String message;

    CommonCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
