package com.itheima.dao.impl;

import com.itheima.domain.User;
import org.junit.Test;

import java.util.List;

/**
 * @Description:
 * @Author: JClearLove
 * @Date: 2020/03/08 08:40
 */
public class ItemsDaoImplTest {

    @Test
    public void findAll() throws Exception {
        ItemsDaoImpl itemsDao = new ItemsDaoImpl();
        List<User> all = itemsDao.findAll();
        for (User user : all) {
            System.out.println(user.toString());
        }

    }
}