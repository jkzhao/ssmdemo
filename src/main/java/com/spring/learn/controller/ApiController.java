package com.spring.learn.controller;

import com.spring.learn.model.User;
import com.spring.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jkzhao on 1/5/18.
 */
@Controller
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user")
    public String getUserById(String user_id, ModelMap map){
        User user =  userService.getUserById(user_id);
        map.put("user", user);

        return "success";
    }

}
