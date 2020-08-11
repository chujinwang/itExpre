package com.cjw.demo.connectionSql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionTest {

    public static void main(String[] args) throws Exception {
        Connection connect = ConnectionSql.getConnect();
        String sql = "select * from user where id=? and username=?";
        PreparedStatement preparedStatement = connect.prepareStatement(sql);
        preparedStatement.setString(1,"1");
        preparedStatement.setString(2,"root");
        ResultSet resultSet = preparedStatement.executeQuery();
        //columnIndex表示第几列
        while(resultSet.next()){

            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("username"));
        }


    }
}
