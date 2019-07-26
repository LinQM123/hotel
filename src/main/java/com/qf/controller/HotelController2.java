package com.qf.controller;

import com.qf.dao.HotelDao2;
import com.qf.entity.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/hotel")
public class HotelController2 {
    @Autowired
    private HotelDao2 hd;

    @RequestMapping(value = "/toshowhotel",method = RequestMethod.GET)
    public String toshowhotel(Hotel hotel, ModelMap map){
        List<Hotel> list=hd.selectAll();
        map.addAttribute("list",list);
        return "tables";
    }

    @RequestMapping(value = "/tosearchhotelbyname",method = RequestMethod.GET)
    public String tosearchhotelbyname(String name, ModelMap map){
        List<Hotel> list=hd.selectByName(name);
        map.addAttribute("list",list);
        return "tables";
    }

}
