package com.lanou.action;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by dllo on 17/11/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:applicationContext.xml"})
public class UserActionTest {

//    private ApplicationContext ctx;
//
//    @Before
//    public void init(){
//        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//    }

    @Resource
    private UserAction userAction;
    @Test
    public void test(){

//        UserAction userAction = (UserAction) ctx.getBean("userAction");

        System.out.println(userAction.login());
    }

}