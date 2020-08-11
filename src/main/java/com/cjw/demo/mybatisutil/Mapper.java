package com.cjw.demo.mybatisutil;

import com.cjw.demo.entity.User;
import com.cjw.demo.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Mapper {


    public static SqlSessionFactory getSession()  throws Exception{
        String resource = "mapper\\mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }


    public static void main(String[] args) throws Exception{
        SqlSessionFactory session = getSession();
        SqlSession sqlSession = session.openSession();
        try{

            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> users = mapper.queryU();
            for (User user:users){
                System.out.println("dayin"+user.getUserName());
            }
        }catch (Exception e){
            throw new Exception("sfa");
        }finally {
            sqlSession.close();
        }

    }
}
