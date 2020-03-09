package com.maven.core.profiles.service;

import com.maven.core.profiles.pojo.User;
    /**
 * @Description:
 * @Author: JClearLove
 * @Date: 2020/03/09 11:57
 */
public interface UserService{


    User selectByPrimaryKey(Integer id);

}
