package com.itheima.ssm.service.impl;

import com.itheima.ssm.pojo.Items;
import com.itheima.ssm.service.ItemsService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: JClearLove
 * @Date: 2020/03/08 15:09
 */
public class ItemsServiceImplTest {

    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }


    @Test
    public void selectById() {
        ItemsService bean = this.context.getBean(ItemsService.class);
        Items items = bean.selectById(1);
        System.out.println(items.getName());

    }
}