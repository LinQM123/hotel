package com.qf.service.Impl;

import com.qf.dao.UserDao;
import com.qf.entity.Admin;
import com.qf.entity.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User checkUser(String userName, String password) {
        return userDao.checkUser(userName,password);
    }

    @Override
    public int insertUser(User user) {

        return userDao.insertUser(user);
    }

    @Override
    public Admin checkAdmin(String adminName, String password) {
        return userDao.checkAdmin(adminName,password);
    }

    @Override
    public int insertAdmin(Admin admin) {
        return userDao.insertAdmin(admin);
    }
}
