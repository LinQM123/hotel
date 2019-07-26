package com.qf.service;

import com.qf.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderService {
    int insertOrder(Order order);
    List<Order> selectOrderByUserName(String userName);
    int deleteOrder(String userName);
}
