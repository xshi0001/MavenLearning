package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

public interface ItemsDao {
    List<User> findAll() throws Exception;
}
