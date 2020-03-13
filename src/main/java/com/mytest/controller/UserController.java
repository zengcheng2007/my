package com.mytest.controller;

import com.mytest.entity.Sys_UserVO;
import com.mytest.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.servlet.ServletContext;
import java.util.List;

@RestController
@Api(tags="User",description = "用户")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ApiOperation(value = "查询所有用户",notes="查询所有用户")
    public List<Sys_UserVO> list() {
        return userService.listAll();
    }

    @RequestMapping(value = "/GetUer",method = RequestMethod.GET)
    public Sys_UserVO  input(Long id) {
        return userService.get(id);
    }

    @GetMapping("/delete")
    public String delete(Long id) {
        if (id != null) {
            userService.delete(id);
        }
        return String.valueOf(userService.listAll().size());
    }

    @PostMapping("/saveOrUpdate")
    public String saveOrUpdate(Sys_UserVO user) {
        if (userService.get(user.getUser_Id()) == null) {
            userService.save(user);
        } else {
            userService.update(user);
        }
        return "success";
    }

}
