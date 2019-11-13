package com.sh0rk.common.pojo;

import com.sh0rk.common.code.BaseCode;
import com.sh0rk.common.enums.CommonCodeEnum;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 通用返回结果对象
 * @param <T>  返回的实体类
 * @author sh0rk
 */
public class Result<T> implements Serializable {
    /**
     * 状态吗
     */
    @Getter
    private Integer code;

    /**
     * 结果信息
     */
    @Getter
    private String message;

    /**
     * 实体对象
     */
    @Getter
    @Setter
    private T entity;

    private Result(BaseCode baseCode){
        this.code = baseCode.getCode();
        this.message = baseCode.getMessage();
    }

    private Result(BaseCode baseCode,T entity){
        this.code = baseCode.getCode();
        this.message = baseCode.getMessage();
        this.entity = entity;
    }

    /**
     * 成功返回，无实体
     * @return 没有实体的结果对象
     */
    public static Result ok(){
        return new Result(CommonCodeEnum.SUCCESS);
    }

    /**
     * 成功返回，有实体
     * @param entity 返回的实体类
     * @param <T> 实体类的类型
     * @return 带有实体的结果对象
     */
    public static <T> Result<T> ok(T entity){
        return new Result<>(CommonCodeEnum.SUCCESS,entity);
    }
}
