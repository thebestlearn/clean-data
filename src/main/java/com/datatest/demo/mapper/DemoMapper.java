package com.datatest.demo.mapper;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by fpf
 * Created date 2018/9/3
 */
@Mapper
public interface DemoMapper {

    @Select("select * from aaa_user")
    List<JSONObject> getDemo();

}
