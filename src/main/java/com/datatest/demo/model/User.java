package com.datatest.demo.model;

/**
 * Created by fpf
 * Created date 2018/9/3
 */
public class User {
    //自增主键ID
    private Integer userId;
    //用户名或者手机号
    private String username;
    //用户密码
    private String password;
    //电子邮件
    private String email;
    //真实姓名
    private String realName;
    //地址
    private String address;
    //电话号
    private String phone;
    //年龄
    private Integer age;
    //性别 1男，2女
    private Integer sex;
    //是否过期0未过期，1过期
    private Integer expired;
    //是否可用1不可用，0可用
    private Integer disabled;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getExpired() {
        return expired;
    }

    public void setExpired(Integer expired) {
        this.expired = expired;
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }
}
