package com.qf.controller;

import com.qf.entity.Admin;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/admin" )
public class AdminController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/toLoginAdminPage",method = RequestMethod.GET)
    public String toLoginAdminPage(){
        return "adminlogin";
    }

    //跳转到注册页面
    @RequestMapping("/registerAdmin")
    public String toRegisterAdmin(){
        return "registerAdmin";
    }

    //登录
    @RequestMapping(value = "/checkAdmin",method = RequestMethod.POST)
    public String checkAdmin(Admin admin , ModelMap modelMap, HttpServletRequest request){
//        User user1 = userService.checkUser(map.get("one").getUsername(),map.get("one").getPassword());
        Admin admin1 = userService.checkAdmin(admin.getAdminName(), admin.getPassword());
//        System.out.println(user1.getUsername());

        if(null!=admin1){


            return "hotelbackstage";
        }
        modelMap.addAttribute("msg1","登录失败");
        return "adminlogin";
    }

    //注册
    @RequestMapping(value="/insertAdmin" , method = RequestMethod.POST)
    public String insertAdmin(Admin admin,ModelMap modelMap,HttpServletRequest req){

        int i = userService.insertAdmin(admin);
        if(i!=0){
            modelMap.addAttribute("msg1","注册成功");
            return "adminlogin";
        }
        modelMap.addAttribute("msg1","注册失败");
        return "adminlogin";
    }
}
