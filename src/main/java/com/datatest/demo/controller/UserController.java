package com.datatest.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.datatest.demo.model.User;
import com.datatest.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by fpf
 * Created date 2018/9/3
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    //获取所有用户信息（测试用）
    @RequestMapping(value="/getUser",method=RequestMethod.POST)
    public List<User> getUser() {
        List<User> user = userService.getUser();
        return user;
    }

    //导入CSV格式用户信息
    @RequestMapping(value="/importCSVUser",method=RequestMethod.POST)
    public JSONObject importCSVUser() {
        JSONObject result = new JSONObject();
//        JSONObject result = userService.importCSVUser();
        return result;
    }


}
