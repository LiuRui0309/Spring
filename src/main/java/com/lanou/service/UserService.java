package com.lanou.service;

import com.lanou.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by dllo on 17/11/6.
 */
@Service("userService")
public class UserService {

    @Resource
    private UserDao userDao;

    public boolean login() {
        return userDao.login();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
