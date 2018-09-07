package com.datatest.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.datatest.demo.service.IDemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private IDemoService demoService;

    @RequestMapping(value="/getDemo",method=RequestMethod.POST)
    public List<JSONObject> getDemo() {
        List<JSONObject> demo = demoService.getDemo();
        return demo;
    }


}
