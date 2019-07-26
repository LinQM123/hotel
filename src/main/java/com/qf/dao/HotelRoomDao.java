package com.qf.dao;

import com.qf.entity.HotelRoom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HotelRoomDao {
    List<HotelRoom> getHotelRooms(@Param("hotelId") int hotelId);
    int setRoomFlag(@Param("roomNum") long roomNum, @Param("hotelName") String hotelName);
    int setRoomFlag1(@Param("roomNum") long roomNum, @Param("hotelName") String hotelName);
}
