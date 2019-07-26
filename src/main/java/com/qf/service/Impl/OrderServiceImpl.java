package com.qf.service.Impl;

import com.qf.dao.OrderDao;
import com.qf.entity.Order;
import com.qf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    //添加订单
    @Override
    public int insertOrder(Order order) {
        return orderDao.insertOrder(order);
    }
    //查看订单
    @Override
    public List<Order> selectOrderByUserName(String userName) {
        return orderDao.selectOrderByUserName(userName);
    }

    //退房（删除订单）
    @Override
    public int deleteOrder(String userName) {
        return orderDao.deleteOrder(userName);
    }
}
