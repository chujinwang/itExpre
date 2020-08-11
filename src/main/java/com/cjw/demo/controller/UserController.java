package com.cjw.demo.controller;

import com.cjw.demo.entity.User;
import com.cjw.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

@Controller
public class UserController{


    @Autowired
    private UserService userService;

    @RequestMapping("test")
    public int  getUser(){
        return userService.addUser();
    }

    @RequestMapping("tt")
    public List<User> queryUser(){
        return userService.queryAll();
    }
}





