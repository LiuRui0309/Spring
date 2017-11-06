package com.lanou.action;

import com.lanou.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by dllo on 17/11/6.
 */
@Controller("userAction")
@Scope("prototype")
public class UserAction {

    @Resource
    private UserService userService;

    public boolean login() {
        return userService.login();
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
