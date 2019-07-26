package com.qf.service.Impl;

import com.qf.dao.ServiceDao;

import com.qf.entity.HotelService;
import com.qf.service.IHotelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class IHotelServiceImpl implements IHotelService {
    @Autowired
    private ServiceDao serviceDao;

    @Override
    public List<HotelService> selectAllService() {
        return serviceDao.selectAllService();

    }

    @Override
    public int addService(HotelService hotelService) {
        return serviceDao.addService(hotelService) ;
    }
}
