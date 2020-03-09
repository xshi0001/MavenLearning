package com.itheima.ssm.mapper;

import com.itheima.ssm.pojo.Items;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: JClearLove
 * @Date: 2020/03/08 14:15
 */
public class ItemsMapperTest {


    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }


    @Test
    public void selectByPrimaryKey() {
        ItemsMapper bean = this.context.getBean(ItemsMapper.class);
        Items items = bean.selectByPrimaryKey(1);
        System.out.println(items.toString());
    }
}