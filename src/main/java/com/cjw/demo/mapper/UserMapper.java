package com.cjw.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cjw.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper extends BaseMapper<User> {


    List<User> queryU();
}
