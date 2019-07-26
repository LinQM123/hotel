package com.qf.controller;

import com.qf.entity.HardWare;
import com.qf.entity.Hotel;
import com.qf.service.IServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("/hotelbackstage")
public class HotelBackstageController {

    @Autowired
    private IServiceDao isd;

    @RequestMapping(value = "/tohotelbackstage",method = RequestMethod.GET)
    public String tohotelbackstage(){
        System.out.println("已进入！");
        return "hotelbackstage";
    }

    @RequestMapping(value = "/toaddhotel",method = RequestMethod.GET)
    public String toaddhotel(){
        System.out.println("已进入！");
        return "addhotel";
    }

    @RequestMapping(value = "/toaddhardware",method = RequestMethod.GET)
    public String toaddhardware(){
        System.out.println("已进入！");
        return "addhardware";
    }




    @RequestMapping(value = "/toAddHotel",method = RequestMethod.POST )
    public String toAddHotel(Hotel hotel, ModelMap map, HttpServletRequest req) throws UnsupportedEncodingException {
        req.setCharacterEncoding("utf-8");
        int i=isd.addHotel(hotel);
        if (i==1){
            map.addAttribute("msg","酒店信息录入成功！");
            return "hotelbackstage";
        }
        map.addAttribute("msg","酒店信息录入失败！");
        return "hotelbackstage";
    }

    @RequestMapping(value = "/toAddHardware",method = RequestMethod.POST )
    public String toAddHardware(HardWare hardWare,ModelMap map){
        int i=isd.addHardware(hardWare);
        if (i==1){
            map.addAttribute("msg","酒店信息录入成功！");
            return "hotelbackstage";
        }
        map.addAttribute("msg","酒店信息录入失败！");
        return "hotelbackstage";
    }
}

