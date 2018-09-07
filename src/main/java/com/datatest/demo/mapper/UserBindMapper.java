package com.datatest.demo.mapper;

import com.datatest.demo.model.UserBind;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

/**
 * Created by fpf
 * Created date 2018/9/3
 */
@Mapper
public interface UserBindMapper {

    @Insert({ "insert into aaa_user_bind_system(user_id,user_bind_system_name,original_system_user_id) " +
            "values (#{userId},#{userBindName},#{originalUserId}" })
    @Options(useGeneratedKeys = true, keyProperty = "user_bind_system_id")
    Integer insertUserBind(UserBind userBind);

}
