package com.qf.controller;

import com.qf.entity.Hotel;
import com.qf.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;
    //查看所有酒店
    @RequestMapping(value = "/getAllHotel",method = RequestMethod.GET)
    public String getAllHotel(int page, ModelMap modelMap){
        int pagesize=4;
        List<Hotel> allHotel = hotelService.getAllHotel((page-1)*4);
        modelMap.addAttribute("List",allHotel);
        int hotelAccount = hotelService.getHotelAccount();
        int pageAccount =hotelAccount/pagesize==0 ? hotelAccount/pagesize : hotelAccount/pagesize+1;
        modelMap.addAttribute("pageAccount",pageAccount);
        modelMap.addAttribute("page",page);
        int pages = page-1;
        modelMap.addAttribute("pages",pages);
        int pageb = page +1;
        modelMap.addAttribute("pageb",pageb);
        modelMap.addAttribute("msg","下一页");
        modelMap.addAttribute("msg1","上一页");
        modelMap.addAttribute("msg2","首页");
        modelMap.addAttribute("msg3","尾页");
        return "user";
    }

    //查找酒店
    @RequestMapping(value="/getHotel",method = RequestMethod.GET)
    public String getHotel(String hotelName,ModelMap modelMap){
        List<Hotel> hotel = hotelService.getHotel(hotelName);
        modelMap.addAttribute("hotels",hotel);
        return "user";
    }
}
