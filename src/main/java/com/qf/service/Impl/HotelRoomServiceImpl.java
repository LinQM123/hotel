package com.qf.service.Impl;

import com.qf.dao.HotelRoomDao;
import com.qf.entity.HotelRoom;
import com.qf.service.HotelRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelRoomServiceImpl implements HotelRoomService {
    @Autowired
    private HotelRoomDao hotelRoomDao;
    //查看某个酒店的空房间
    @Override
    public List<HotelRoom> getHotelRooms(int hotelId) {
        return hotelRoomDao.getHotelRooms(hotelId);
    }

    @Override
    public int setRoomFlag(long roomNum,String hotelName) {
        return hotelRoomDao.setRoomFlag(roomNum,hotelName);
    }

    @Override
    public int setRoomFlag1(long roomNum, String hotelName) {
        return hotelRoomDao.setRoomFlag1(roomNum,hotelName);
    }
}
