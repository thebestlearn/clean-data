package com.datatest.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.datatest.demo.model.User;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * Created by fpf
 * Created date 2018/9/3
 */
public interface IUserService {

    public List<User> getUser();

    //批量导入CSV格式用户信息
    public JSONObject importCSVUser() throws IOException;

}
