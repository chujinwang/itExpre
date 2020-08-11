package com.cjw.demo.service.impl;

import com.cjw.demo.entity.User;
import com.cjw.demo.mapper.UserMapper;
import com.cjw.demo.service.UserService;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser() {
        User user = new User();
        user.setId(3);
        user.setUserName("小明");
        user.setPassWord("123456");
        user.setId(32);
        int insert = userMapper.insert(user);
        System.out.println("添加成功没？"+insert);
        User u = new User();
        u.setId(1);
        u.setUserName("小刚");
        u.setPassWord("1234567");
        u.setId(32);
        int i = userMapper.updateById(u);//此方法会更新传值后的字段，没传过值的就不更新
        System.out.println("修改成功没"+i);
        return insert;
    }

    @Override
    public List<User> queryAll() {
        List<User> users = userMapper.queryU();
        return users;
    }
}
