package com.datatest.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.datatest.demo.mapper.DemoMapper;
import com.datatest.demo.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fpf
 * Created date 2018/9/3
 */
@Service
@Transactional
public class DemoService implements IDemoService {

    @Autowired
    private DemoMapper demoMapper;

    public List<JSONObject> getDemo(){
        List<JSONObject> demoList = new ArrayList<JSONObject>();
        demoList = demoMapper.getDemo();
        return demoList;
    }

}
