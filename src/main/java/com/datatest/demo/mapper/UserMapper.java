package com.datatest.demo.mapper;

import com.datatest.demo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by fpf
 * Created date 2018/9/3
 */
@Mapper
public interface UserMapper {

    @Select("select user_id as userId,username,password,email,real_name as realName,address" +
            ",phone,age,sex,expired,disabled from aaa_user")
    List<User> getUser();

    @Insert({ "insert into aaa_user(username,password,email,real_name,address,phone,age,sex,expired,disabled) " +
            "values (#{username},#{password},#{email},#{realName},#{address},#{phone},#{age},#{sex},#{expired},#{disabled})" })
    @Options(useGeneratedKeys = true, keyProperty = "user_id")
    Integer insertUser(User user);

}
