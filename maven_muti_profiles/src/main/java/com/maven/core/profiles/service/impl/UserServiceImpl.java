package com.maven.core.profiles.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.maven.core.profiles.pojo.User;
import com.maven.core.profiles.mapper.UserMapper;
import com.maven.core.profiles.service.UserService;
/**
 * @Description:
 * @Author: JClearLove
 * @Date: 2020/03/09 11:57
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

}
