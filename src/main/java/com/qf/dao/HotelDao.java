package com.qf.dao;

import com.qf.entity.Hotel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HotelDao {
    List<Hotel> getAllHotel(@Param("page") int page);
    List<Hotel> getHotel(@Param("hotelName") String hotelName);
    int getHotelAccount();
}
