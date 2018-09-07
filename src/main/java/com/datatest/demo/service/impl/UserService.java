package com.datatest.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.csvreader.CsvReader;
import com.datatest.demo.mapper.UserBindMapper;
import com.datatest.demo.mapper.UserMapper;
import com.datatest.demo.model.User;
import com.datatest.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fpf
 * Created date 2018/9/3
 */
@Service
@Transactional
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserBindMapper userBindMapper;

    public List<User> getUser(){
        List<User> userList = new ArrayList<User>();
        userList = userMapper.getUser();
        return userList;
    }

    // 批量导入CSV格式用户信息
    public JSONObject importCSVUser() throws IOException {
        // 用于返回信息json
        JSONObject result = new JSONObject();
        // csv文件路径
        String filePath = "XXX.csv";
        // 返回成功绑定数
        Integer successCount = 0;
        // 返回报警数据数
        Integer warningCount = 0;
        // 创建CSV读对象
        CsvReader csvReader = new CsvReader(filePath);
        // 读表头
        csvReader.readHeaders();
        // 循环处理CSV中的数据
        while (csvReader.readRecord()){
            // 读取本行数据的用户名
            String username = csvReader.get("username");
            System.out.println(csvReader.get("username"));
        }
//        userMapper.insertUser();
//        userBindMapper.insertUserBind();
        result.put("msg","导入绑定成功'" + successCount + "'位用户,绑定失败报警数据数量'" + warningCount + "'位用户.");
        return result;
    }

}
