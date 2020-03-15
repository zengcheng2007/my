package com.mytest.controller;

import com.mytest.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserControllerTest {
    @Autowired
    private UserController userController;

    @Test
    public void list() {
        System.out.println(userController.list().size());
    }

    @Test
    public void input() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void saveOrUpdate() {
    }
}