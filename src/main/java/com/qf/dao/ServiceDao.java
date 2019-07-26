package com.qf.dao;


import com.qf.entity.HotelService;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceDao {
  List<HotelService> selectAllService();
  int addService(HotelService hotelService);



}
