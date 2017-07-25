package com.myDemo.action;

import com.myDemo.model.UserEntity;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by thanatos on 2017/7/24.
 */
public class UserAction extends ActionSupport {
    private UserEntity userEntity;
    private String userName;
    private String password;

    public String signIn() {
        System.out.println("userName:"+userName);
        System.out.println("password:"+password);
        userEntity.setUserName(userName);
        userEntity.setPassword(password);
        return SUCCESS;
    }

    public String signUp() {
        return SUCCESS;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserEntity getUser() {
        return userEntity;
    }

    public void setUser(UserEntity user) {
        this.userEntity = user;
    }
}
