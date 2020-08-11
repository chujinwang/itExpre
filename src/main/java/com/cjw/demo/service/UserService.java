package com.cjw.demo.service;

import com.cjw.demo.entity.User;

import java.util.List;

public interface UserService {


    int addUser();

    List<User> queryAll();

}
