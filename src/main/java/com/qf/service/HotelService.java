package com.qf.service;

import com.qf.entity.Hotel;

import java.util.List;

public interface HotelService {
    List<Hotel> getAllHotel(int page);
    int getHotelAccount();
    List<Hotel> getHotel(String hotelName);
}
