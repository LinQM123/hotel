package com.qf.controller;

import com.qf.entity.Order;
import com.qf.entity.User;
import com.qf.service.OrderService;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/user" )
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private OrderService orderService;

    //进入初始界面
    @RequestMapping(value = "/toIndex",method = RequestMethod.GET)
    public String toIndex(){
        return "index";
    }

    @RequestMapping(value = "/toLoginPage",method = RequestMethod.GET)
    public String toLoginPage(){
        return "login";
    }

    //跳转到注册页面
    @RequestMapping("/register1")
    public String toRegister(){
        return "register1";
    }

    //登录
    @RequestMapping(value = "/checkUser",method = RequestMethod.POST)
    public String checkUser(User user , ModelMap modelMap, HttpServletRequest request){
//        User user1 = userService.checkUser(map.get("one").getUsername(),map.get("one").getPassword());
        User user1 = userService.checkUser(user.getUserName(), user.getPassword());
//        System.out.println(user1.getUsername());
        List<Order> orders = orderService.selectOrderByUserName(user1.getUserName());
        if(null!=user1){
            modelMap.addAttribute("msg", "欢迎光临");
            modelMap.addAttribute("userName", user1.getUserName());
            if(null!=orders){
                modelMap.addAttribute("orders",orders);
            }
            modelMap.addAttribute("ordermsg","您还没下单(⊙o⊙)");
            if("admin"==user1.getUserName()){
                return "manager";
            }
            return "user";
        }
        return "login";
    }

    //注册
    @RequestMapping(value="/insertUser" , method = RequestMethod.POST)
    public String insertUser(User user,ModelMap modelMap,HttpServletRequest req){

        int i = userService.insertUser(user);
        if(i!=0){
            modelMap.addAttribute("msg1","注册成功");
           return "login";
        }
        modelMap.addAttribute("msg1","注册失败");
        return "register1";
    }
    //进入画廊页面
    @RequestMapping(value = "/togalleryPage",method = RequestMethod.GET)
    public String togalleryPage(){
        return "gallery";
    }
    //进入建议页面
    @RequestMapping(value = "/tocontactPage",method = RequestMethod.GET)
    public String tocontactPage(){
        return "contact";
    }
}
