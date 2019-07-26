package com.qf.service.Impl;

import com.qf.dao.HotelDao;
import com.qf.entity.Hotel;
import com.qf.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelDao hotelDao;


    //分页查询酒店
    @Override
    public List<Hotel> getAllHotel(int page) {
        return hotelDao.getAllHotel(page);
    }
    //查询酒店总数
    @Override
    public int getHotelAccount() {
        return hotelDao.getHotelAccount();
    }

    @Override
    public List<Hotel> getHotel(String hotelName) {
        return hotelDao.getHotel(hotelName);
    }
}
