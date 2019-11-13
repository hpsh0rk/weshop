package com.sh0rk.demo.module1.controller;

import com.sh0rk.common.pojo.Result;
import com.sh0rk.demo.module1.controller.ViewVO.UserVO;
import com.sh0rk.demo.module1.entity.UserDO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * @author sh0rk
 **/
@Api(tags = "商品相关接口", description = "提供商品相关的Rest API")
@RestController
@RequestMapping("/item")
public class ItemController {
    @ApiOperation("获取用户信息接口")
    @GetMapping("/{id}")
    public Result<UserVO> getUser(
            @ApiParam("查询的用户id") @PathVariable("id") Integer id){
        UserVO sh0rk = new UserVO(id, "sh0rk");
        return Result.ok(sh0rk);
    }

    @ApiOperation("新增用户接口")
    @PostMapping
    public Result<UserVO> addUser(
            @ApiParam("新增用户的信息") @RequestBody UserDO userDO){
        return Result.ok();
    }
}
