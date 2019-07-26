package com.qf.dao;


import com.qf.entity.Admin;
import com.qf.entity.User;

import org.apache.ibatis.annotations.Param;




public interface UserDao {

    User checkUser(@Param("userName") String userName, @Param("password") String password);
    Admin checkAdmin(@Param("adminName") String adminName, @Param("password") String password);
    int insertUser(User user);
    int insertAdmin(Admin admin);

}
