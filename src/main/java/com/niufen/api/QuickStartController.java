package com.niufen.api;

import com.niufen.entity.User;
import com.niufen.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ConfigurationProperties(prefix = "person")
public class QuickStartController {

    private String name;

    @Autowired
    private UserMapper userMapper;


    public void setName(String name) {
        this.name = name;
    }

    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        return "springboot1111 访问成功!!!."+name;
    }


    @RequestMapping("/queryUser")
    @ResponseBody
    public List<User> queryUser(){
        List<User> users = userMapper.queryUserList();
        return users;
    }

}