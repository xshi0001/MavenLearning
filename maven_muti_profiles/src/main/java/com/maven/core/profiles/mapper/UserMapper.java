package com.maven.core.profiles.mapper;

import com.maven.core.profiles.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description:
 * @Author: JClearLove
 * @Date: 2020/03/09 11:57
 */
@Mapper
public interface UserMapper {
    User selectByPrimaryKey(Integer id);
}