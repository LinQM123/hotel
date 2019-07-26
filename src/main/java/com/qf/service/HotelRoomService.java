package com.qf.service;

import com.qf.entity.HotelRoom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HotelRoomService {
    List<HotelRoom> getHotelRooms(int hotelId);
    int setRoomFlag(long roomNum, String hotelName);
    int setRoomFlag1(long roomNum, String hotelName);
}
