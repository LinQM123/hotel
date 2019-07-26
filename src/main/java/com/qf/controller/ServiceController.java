package com.qf.controller;

import com.qf.dao.ServiceDao;
import com.qf.entity.HotelService;
import com.qf.service.IHotelService;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/user")
public class ServiceController {
    @Autowired
    private ServiceDao serviceDao;
    @RequestMapping(value = "/toservicelistpage", method = RequestMethod.GET)
    public String toservicelistpage(ModelMap modelMap){
        List<HotelService> hotelServices = serviceDao.selectAllService();
        modelMap.addAttribute("msg",hotelServices);
        return "service";
    }
    @RequestMapping(value = "/success", method = RequestMethod.POST)
    public String success(HotelService hotelService,ModelMap modelMap){
        int i = serviceDao.addService(hotelService);
        if (i == 0) {
            modelMap.addAttribute("addservice", "<font color='red'>提交服务失败</font>");
            return "service";
        }
        if (i > 0){
            modelMap.addAttribute("addservice","<font color = 'green'>提交服务成功</font>");
            return "service";
        }
        return "a";



    }
    @RequestMapping(value = "/toServicePage", method = RequestMethod.GET)
    public String toServicePage(){
        return "service";
    }






}
