package com.qf.service;

import com.qf.entity.Admin;
import com.qf.entity.Hotel;
import com.qf.entity.User;



public interface UserService {
    User checkUser(String userName, String password);
    int insertUser(User user);
    Admin checkAdmin(String adminName, String password);
    int insertAdmin(Admin admin);

}
