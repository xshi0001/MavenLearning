package com.maven.core.profiles.mapper;


import com.maven.core.profiles.MavenMutiProfilesApplicationTests;
import com.maven.core.profiles.pojo.User;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: JClearLove
 * @Date: 2020/03/09 12:00
 */
public class UserMapperTest extends MavenMutiProfilesApplicationTests {
    @Resource
    private UserMapper userMapper;

    @Test
    public void selectByPrimaryKey() {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user.toString());
    }
}