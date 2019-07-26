package com.qf.controller;

import com.qf.entity.Order;
import com.qf.service.HotelRoomService;
import com.qf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private HotelRoomService hotelRoomService;
    //跳转order页面
    @RequestMapping(value = "/toorder",method = RequestMethod.GET)
    public String toOrder(String hotelName,String roomNum,ModelMap modelMap){
        modelMap.addAttribute("hotelName",hotelName);
        modelMap.addAttribute("roomNum",roomNum);
        return "order";
    }

    //提交订单
    @RequestMapping(value = "/insertOrder",method = RequestMethod.POST)
    public String insertOrder(Order order,ModelMap modelMap){
        //把已经下单了的房间从空房中去掉。
        hotelRoomService.setRoomFlag(order.getRoomNum(),order.getHotelName());
        int i = orderService.insertOrder(order);

        if(i!=0){
            modelMap.addAttribute("msg","下单成功");
            modelMap.addAttribute("userName",order.getUserName());
            return "myorder";
        }
        modelMap.addAttribute("msg","下单失败");
        return "myorder";
    }
    //查看订单
    @RequestMapping(value="/selectOrderByUserName",method = RequestMethod.GET)
    public String selectOrderByUserName(String userName,ModelMap modelMap){

        List<Order> orders = orderService.selectOrderByUserName(userName);
        modelMap.addAttribute("orders",orders);
        return "myorder";
    }
    //删除订单
    @RequestMapping(value = "/deleteOrder",method = RequestMethod.GET)
    public String deleteOrder(Order order,ModelMap modelMap){
        int i = orderService.deleteOrder(order.getUserName());
        System.out.println(order.getRoomNum());
        if(i!=0){
            modelMap.addAttribute("msg","退房成功");
            hotelRoomService.setRoomFlag1(order.getRoomNum(),order.getHotelName());
            return "myorder";
        }
        modelMap.addAttribute("msg","退房不成功");
        return "myorder";

    }

}
