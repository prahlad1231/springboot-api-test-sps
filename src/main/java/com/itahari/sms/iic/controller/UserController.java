package com.itahari.sms.iic.controller;

import com.itahari.sms.iic.model.User;
import com.itahari.sms.iic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("admin/user")
public class UserController {

    @Autowired
    private UserService userService;

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
