package com.qf.dao;

import com.qf.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDao {
    int insertOrder(@Param("order") Order order);
    List<Order> selectOrderByUserName(@Param("userName") String userName);
    int deleteOrder(@Param("userName") String userName);
}
