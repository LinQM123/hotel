package com.qf.dao;

import com.qf.entity.Hotel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelDao2 {
    Integer addHotel(Hotel hotel);
    List<Hotel> selectAll();
    List<Hotel> selectByName(String name);
}
