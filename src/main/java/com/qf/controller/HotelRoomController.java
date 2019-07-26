package com.qf.controller;

import com.qf.entity.HotelRoom;
import com.qf.service.HotelRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/hotelRoom")
public class HotelRoomController {
    @Autowired
    private HotelRoomService hotelRoomService;

    //查看某个酒店的空房间
    @RequestMapping(value = "getHotelRoom" ,method = RequestMethod.GET)
    public String getHotelRooms(int hotelId, ModelMap modelMap){
        List<HotelRoom> hotelRooms = hotelRoomService.getHotelRooms(hotelId);
        modelMap.addAttribute("hotelRooms",hotelRooms);
        return "hotelRoom";
    }
}
