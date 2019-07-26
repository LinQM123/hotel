package com.qf.service.Impl;

import com.qf.dao.HardwareDao2;
import com.qf.dao.HotelDao;
import com.qf.dao.HotelDao2;
import com.qf.entity.HardWare;
import com.qf.entity.Hotel;
import com.qf.service.IServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IServiceImPl implements IServiceDao {

    @Autowired
    private HotelDao2 hd;

    @Autowired
    private HardwareDao2 hdd;
    @Override
    public Integer addHardware(HardWare hardWare) {
        return hdd.addHardware(hardWare);
    }

    @Override
    public Integer addHotel(Hotel hotel) {
        return hd.addHotel(hotel);
    }

    @Override
    public List<Hotel> selectAll() {
        return hd.selectAll();
    }

    @Override
    public List<Hotel> selectByName(String name) {
        return hd.selectByName(name);
    }
}
