package com.cjw.demo.mybatisutil;

import com.cjw.demo.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Test {

    public static void main(String[] args) throws Exception{
        String resource = "mapper\\mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取sqlsession实例
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            User o = sqlSession.selectOne("com.cjw.demo.mapper.Us.queryUser", 1);
            System.out.println(o.getUserName());
        }catch (Exception e){
            throw new Exception("出现问题了");
        }finally {
            sqlSession.close();
        }


    }
}
