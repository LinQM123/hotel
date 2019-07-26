package com.qf.controller;


import com.qf.entity.HardWare;
import com.qf.service.HardWareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HardWareController {
    @Autowired
    private HardWareService hardWareService;

    @RequestMapping(value = "/hardware", method = RequestMethod.GET)
    public String HardWare(ModelMap modelMap) {
        List<HardWare> list = hardWareService.selectAll();
        modelMap.addAttribute("list", list);
        return "hardwarechange";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(HardWare hardWare) {
        int i = hardWareService.update(hardWare);
        if (i != 0) {
            return "service";
        }
        return "hardwarechange";
    }

    @RequestMapping(value = "/selectall", method = RequestMethod.GET)
    public String selectAll(ModelMap modelMap) {
        List<HardWare> list = hardWareService.selectAll();
        modelMap.addAttribute("list", list);
        return "hardwaretables";
    }

    @RequestMapping(value = "/hotelinfo", method = RequestMethod.GET)
    public String toOrder(@RequestParam("hotelName") String hotelName, @RequestParam("roomNum") String roomNum, ModelMap modelMap) {
        modelMap.addAttribute("hotelName", hotelName);
        modelMap.addAttribute("roomNum", roomNum);
        return "hardwarechange";
    }
}
