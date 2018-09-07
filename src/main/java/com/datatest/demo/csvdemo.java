package com.datatest.demo;

import com.csvreader.CsvReader;
import com.datatest.demo.model.User;
import com.datatest.demo.model.UserBind;

import java.io.IOException;

/**
 * Created by fpf
 * Created date 2018/9/6
 */
public class csvdemo {

    public static void main(String[] args){
        // 用于返回信息json
        // csv文件路径
        String filePath = "C:\\Users\\Thinkpad\\Desktop\\data.csv";
        // 当前循环次数
        int index = 0;
        // 返回成功绑定数
        int successCount = 0;
        // 返回报警数据数
        int warningCount = 0;
        // 插入失败数量
        int insertErrorCount = 0;
        // 重复用户数量
        int repeatUserCount = 0;
        // 插入成功后返回的用户ID
        int insertUserId = 0;
        // 插入成功后返回的用户绑定ID
        int insertUserBindId = 0;
        // 插入失败的信息
        StringBuffer insertErrorMsg = new StringBuffer("");
        // 用户名
        String username = "";
        // 手机号
        String phone = "";
        // User对象
        User user = null;
        // UserBind对象
        UserBind userBind = null;
        try {
            // 创建CSV读对象
            CsvReader csvReader = new CsvReader(filePath);
            // 读表头
            csvReader.readHeaders();
            // 循环处理CSV中的数据
            while (csvReader.readRecord()){
                // 记录当前循环次数
                index ++;
                // 读取本行数据的用户名
                username = csvReader.get("username");
                // 根据用户名查询库中是否有重复数据
                // repeatUserCount = getRepeatUserCountByUsername();
                // 判断库中是否有重复用户名
                if (0 == repeatUserCount) {
                    // 没有重复
                    // 读取本行数据的手机号
                    phone = csvReader.get("phone");
                    // 根据手机号查询库中是否有重复数据
                    // repeatUserCount = getRepeatUserCountByPhone();
                    // 判断库中是否有重复手机号
                    if (0 == repeatUserCount) {
                        // 没有重复
                        user = new User();
                        // 用户名
                        user.setUsername(username);
                        // 密码
                        user.setPassword(csvReader.get("password"));
                        // 电子邮箱
                        user.setEmail(csvReader.get("email"));
                        // 真实姓名
                        user.setRealName(csvReader.get("realName"));
                        // 地址
                        user.setAddress(csvReader.get("address"));
                        // 手机号
                        user.setPhone(phone);
                        // 判断年龄是否为空
                        if (null == csvReader.get("age") || "".equals(csvReader.get("age"))) {
                            // 如果年龄为空
                            user.setAge(0);
                        } else {
                            // 如果年龄不为空
                            user.setAge(Integer.valueOf(csvReader.get("age")));
                        }
                        // 判断性别是否为空
                        if (null == csvReader.get("sex") || "".equals(csvReader.get("sex"))) {
                            // 如果性别为空
                            user.setSex(0);
                        } else {
                            // 如果性别不为空
                            user.setSex(Integer.valueOf(csvReader.get("sex")));
                        }
                        // 默认设置用户未过期
                        user.setExpired(0);
                        // 默认设置用户可用
                        user.setDisabled(0);
                        // 插入用户数据并返回用户ID
                        // insertUserId = insertUser(user);
                        // 判断用户是否插入成功
                        if (0 == insertUserId) {
                            // 插入失败
                            insertErrorCount ++;
                            insertErrorMsg.append("第" + index + "行数据,用户名为'" + username + "'的用户在插入'用户'时失败");
                        } else {
                            // 用户插入成功继续开始插入绑定表
                            userBind = new UserBind();
                            // 用户ID
                            userBind.setUserId(insertUserId);
                            // 用户原系统名字
                            userBind.setUserBindSystemName(csvReader.get("systemname"));
                            // 用于在原系统的用户ID
                            userBind.setOriginalSystemUserId(csvReader.get("userId"));
                            // 插入用户绑定数据并返回用户绑定ID
                            // insertUserBindId = insertUserBind(userBind);
                            // 判断用户绑定是否插入成功
                            if (0 == insertUserBindId) {
                                // 插入失败
                                insertErrorCount++;
                                insertErrorMsg.append("第" + index + "行数据,用户名为'" + username + "'的用户在插入'用户绑定'时失败");
                                // 将之前插入的用户表的删除回滚
                                // int deleteUserCount = deleteUser(insertUserId);
                                // ---------------------------------------------------------
//                                if (0 == deleteUserCount) {
//                                    // 删除失败
//                                    deleteErrorMsg.append("用户ID为'" + insertUserId + "',用户名为" + username + "的用户在'回滚删除用户'时失败,请手动处理");
//                                }
                            } else {
                                // 插入成功
                                successCount ++;
                            }
                        }
                    } else {
                        // ---------------------2018.09.06-------------------------
                        // 发现重复
                    }
                } else {
                    // 发现重复
                }
                System.out.println(csvReader.get("username"));
                System.out.println(csvReader.get("phone"));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        userMapper.insertUser();
//        userBindMapper.insertUserBind();
//        result.put("msg","导入绑定成功'" + successCount + "'位用户,绑定失败报警数据数量'" + warningCount + "'位用户.");
    }

}
