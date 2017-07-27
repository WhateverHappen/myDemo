package com.myDemo.action;

import com.myDemo.model.UserEntity;
import com.myDemo.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by thanatos on 2017/7/24.
 */
public class UserAction extends ActionSupport {
    private UserService userService = new UserService();
    private UserEntity userEntity;
    private String userName;
    private String password;
    private String passwordCheck;
    private String sex;
    private int age;

    public String signIn() {
        System.out.println("userName:" + userName);
        System.out.println("password:" + password);
        String result = userService.checkUser(userName, password);
        if (result.equals("success")) {
            return SUCCESS;
        } else if (result.equals("error")) {
            return ERROR;
        }
        return ERROR;
    }

    public String signUp() {
        System.out.println("userName:" + userName);
        System.out.println("password:" + password);
        System.out.println("passwordCheck:"+passwordCheck);
        System.out.println("sex:" + sex);
        System.out.println("age:" + age);
//        if(!passwordCheck.equals(password)){
//            return ERROR;
//        }
        String result = userService.addUser(this.userEntity, this.userName, this.password, this.sex, this.age);
        if (result.equals("success")) {          //添加用户成功
            return SUCCESS;
        } else if (result.equals("error")) {      //用户名重复
            return ERROR;
        }
        return ERROR;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPasswordCheck() {
        return passwordCheck;
    }

    public void setPasswordCheck(String passwordCheck) {
        this.passwordCheck = passwordCheck;
    }
}
