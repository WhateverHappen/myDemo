package com.myDemo.service;

import com.myDemo.model.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by thanatos on 2017/7/25.
 */
public class UserServiceTest {
    UserService userService = new UserService();
    @Test
    public void addUser() throws Exception {
        UserEntity userEntity = new UserEntity();
        userService.addUser(userEntity,"Hank","123","man",15);
    }

}