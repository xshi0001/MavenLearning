package com.maven.core.profiles.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description:
 * @Author: JClearLove
 * @Date: 2020/03/09 11:57
 */
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private Integer id;

    /**
    * 用户名称
    */
    private String username;

    /**
    * 生日
    */
    private Date birthday;

    /**
    * 性别
    */
    private String sex;

    /**
    * 地址
    */
    private String address;

    private static final long serialVersionUID = 1L;
}