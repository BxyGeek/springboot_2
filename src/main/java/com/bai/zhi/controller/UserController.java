package com.bai.zhi.controller;


import com.bai.zhi.entity.User;
import com.bai.zhi.mapper.UserMapper;
import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author bxy
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("queryAll")
    @ResponseBody
    public List<User> queryAll(){
        List<User> users = userMapper.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }
}
