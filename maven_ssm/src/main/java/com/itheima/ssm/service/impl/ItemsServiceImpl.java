package com.itheima.ssm.service.impl;

import com.itheima.ssm.mapper.ItemsMapper;
import com.itheima.ssm.pojo.Items;
import com.itheima.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: maven_ssm
 * @description:
 * @author: JClearLove
 * @Date: 2020/03/08 15:06
 */
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public Items selectById(Integer id) {
        return itemsMapper.selectByPrimaryKey(id);
    }
}

