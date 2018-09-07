package com.datatest.demo.model;

/**
 * Created by fpf
 * Created date 2018/9/3
 */
public class UserBind {

    //绑定表自增主键Id
    private Integer userBindId;
    //用户表主键Id
    private Integer userId;
    //用户绑定的系统名字
    private String userBindSystemName;
    //对应的原系统Id
    private String originalSystemUserId;

    public Integer getUserBindId() {
        return userBindId;
    }

    public void setUserBindId(Integer userBindId) {
        this.userBindId = userBindId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserBindSystemName() {
        return userBindSystemName;
    }

    public void setUserBindSystemName(String userBindSystemName) {
        this.userBindSystemName = userBindSystemName;
    }

    public String getOriginalSystemUserId() {
        return originalSystemUserId;
    }

    public void setOriginalSystemUserId(String originalSystemUserId) {
        this.originalSystemUserId = originalSystemUserId;
    }
}
