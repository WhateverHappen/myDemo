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

    /**
     * 用户登录，用于与Struts框架结合
     *
     * @return 若登录校验成功，则返回success，否则返回error
     */
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


    /**
     * 用户注册，用于与Struts框架结合
     *
     * @return 若注册校验成功，则返回success，否则返回error
     */
    public String signUp() {
        System.out.println("userName:" + userName);
        System.out.println("password:" + password);
        System.out.println("passwordCheck:" + passwordCheck);
        System.out.println("sex:" + sex);
        System.out.println("age:" + age);
        String result = userService.addUser(this.userEntity, this.userName, this.password, this.sex, this.age);
        if (result.equals("success")) {          //添加用户成功
            return SUCCESS;
        } else if (result.equals("error")) {      //用户名重复
            return ERROR;
        }
        return ERROR;
    }

    public void validateSignUp() {
        //用户名校验
        if (userName == null || userName.equals("") || !userName.matches("^\\w*&")
                || userName.length() < 4 || userName.length() > 10) {
            addFieldError("userName", "用户名必须是字母和数字，长度介于4到10之间");
        }

        //密码校验
        if (password == null || password.equals("") || password.length() < 8
                || password.length() > 15) {
            addFieldError("password", "密码长度必须介于8到15之间");
        }

        //重复密码校验
        if (!passwordCheck.equals(password)) {
            addFieldError("passwordCheck", "再次输入密码不一致");
        }

        //年龄校验
        if (age < 0 || age > 200) {
            addFieldError("age", "无效年龄");
        }
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
