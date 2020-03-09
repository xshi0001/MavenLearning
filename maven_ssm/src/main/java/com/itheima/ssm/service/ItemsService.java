package com.itheima.ssm.service;

import com.itheima.ssm.pojo.Items;

/**
 * @program: maven_ssm
 * @description: service 层
 * @author: JClearLove
 * @Date: 2020/03/08 15:04
 */
public interface ItemsService {
    Items selectById(Integer id);
}
