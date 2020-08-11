package com.cjw.demo.connectionSql;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionSql {


    public static Connection getConnect() throws Exception{
        Class clazz = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver)clazz.newInstance();
        String url = "jdbc:mysql://192.168.1.221:3306/activiti";
        Properties info = new Properties();
        info.setProperty("user","rkang");
        info.setProperty("password","123456");
        Connection conn = driver.connect(url,info);
        return conn;
    }

    public static Connection getConnect1() throws Exception{
        Class clazz = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver)clazz.newInstance();//这一步可以省略 因为有static{}代码块
        String url = "jdbc:mysql://192.168.1.221:3306/activiti";
        Properties info = new Properties();
        info.setProperty("user","rkang");
        info.setProperty("password","123456");
        DriverManager.registerDriver(driver);
        Connection connection = DriverManager.getConnection(url, info);
        return connection;
    }

public static Connection getConn() throws  Exception{
        InputStream resourceAsStream = ConnectionSql.class.getClassLoader().getResourceAsStream("application.properties");
        Properties pro = new Properties();
        pro.load(resourceAsStream);
        String driver = pro.getProperty("jdbc.driver");
        String url = pro.getProperty("jdbc.url");
        String user = pro.getProperty("jdbc.username");
        String password = pro.getProperty("jdbc.password");
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }


    public static void main(String[] args) throws Exception {

    }

    }
