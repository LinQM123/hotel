package com.qf.service;

import com.qf.entity.HardWare;
import com.qf.entity.Hotel;

import java.util.List;

public interface IServiceDao {
    Integer addHardware(HardWare hardWare);
    Integer addHotel(Hotel hotel);
    List<Hotel> selectAll();
    List<Hotel> selectByName(String name);
}
