package com.spring.learn.service.impl;

import com.spring.learn.dao.automatic.UserMapper;
import com.spring.learn.model.User;
import com.spring.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jkzhao on 1/5/18.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    public User getUserById(String id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
