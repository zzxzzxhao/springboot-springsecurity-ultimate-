package com.deceen.demo.dao;

import com.deceen.demo.entity.SelfUserDetails;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @author: zzx
 * @date: 2018/10/18 14:59
 * @description: 用户dao层
 */
@Component
public interface UserMapper {

    //通过username查询用户
    SelfUserDetails getUser(@Param("username") String username);

}
