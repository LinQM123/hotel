package com.qf.service;


import com.qf.entity.HotelService;



import java.util.List;

public interface IHotelService {
    List<HotelService> selectAllService();
    int addService(HotelService hotelService);




}
