package com.maven.core.profiles.control;

import com.maven.core.profiles.pojo.User;
import com.maven.core.profiles.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: maven_muti_profiles
 * @description:
 * @author: JClearLove
 * @Date: 2020/03/09 11:58
 */
@RestController
@RequestMapping("/user")
public class UserControl {
    @Autowired
    private UserService userService;

    @RequestMapping("/query")
    public String testQuery() {
        User user = userService.selectByPrimaryKey(1);
        return user.toString();
    }
}

