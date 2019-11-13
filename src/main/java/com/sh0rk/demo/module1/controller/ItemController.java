package com.sh0rk.demo.module1.controller;

import com.sh0rk.common.pojo.Result;
import com.sh0rk.demo.module1.controller.ViewVO.UserVO;
import org.springframework.web.bind.annotation.*;

/**
 * @author sh0rk
 **/
@RestController
@RequestMapping("/item")
public class ItemController {
    @GetMapping("/{id}")
    public Result<UserVO> getUser(@PathVariable("id") Integer id){
        UserVO sh0rk = new UserVO(id, "sh0rk");
        return Result.ok(sh0rk);
    }

    @PostMapping("/{id}")
    public Result<UserVO> addUser(@PathVariable("id") Integer id){
        // UserVO sh0rk = new UserVO(id, "sh0rk");
        return Result.ok();
    }
}
