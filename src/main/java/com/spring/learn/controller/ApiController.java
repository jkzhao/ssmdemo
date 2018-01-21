package com.spring.learn.controller;

import com.spring.learn.model.User;
import com.spring.learn.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jkzhao on 1/5/18.
 */
@Controller
@RequestMapping("/api")
@Api(value = "api接口", description="用户相关操作")
public class ApiController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user", method = {RequestMethod.GET})
    @ApiOperation(value = "用户查询服务", notes = "根据传过来的user_id来查询用户")
    public String getUserById(@ApiParam(value = "用户id") String user_id, ModelMap map){
        User user =  userService.getUserById(user_id);
        map.put("user", user);

        return "success";
    }

}
