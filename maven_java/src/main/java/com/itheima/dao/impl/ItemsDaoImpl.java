package com.itheima.dao.impl;


import com.itheima.dao.ItemsDao;
import com.itheima.domain.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * 要想从数据库中取出数据
 * 必须有四个属性：数据库驱动，连接数据库的地址，数据库用户名称，数据库密码。
 */
public class ItemsDaoImpl implements ItemsDao {
    @Override
    public List<User> findAll() throws Exception {
        List<User> list = new ArrayList<User>();
        //先获取contection对象
        Connection connection = null;
        //获取真正操作数据的对象
        PreparedStatement pst = null;
        //执行数据库查询操作
        ResultSet rs = null;
        try {
            //加载驱动类
            Class.forName("com.mysql.jdbc.Driver");
            //先获取contection对象
            connection = DriverManager.getConnection("jdbc:mysql://192.168.130.37:3306/HeiMa", "root", "root");
            //获取真正操作数据的对象
            pst = connection.prepareCall("select * from HeiMa.user");
            //执行数据库查询操作
            rs = pst.executeQuery();
            //把数据库结果集转成java的List集合

            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                list.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
            pst.close();
            rs.close();
        }

        return list;
    }
}
