package com.qf.entity;

public class Order {
    private long orderId;
    private String orderState;
    private String userName;
    private String hotelName;
    private long roomNum;

    public Order() {
    }

    public Order(long orderId, String orderState, String userName, String hotelName, long roomNum) {
        this.orderId = orderId;
        this.orderState = orderState;
        this.userName = userName;
        this.hotelName = hotelName;
        this.roomNum = roomNum;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public long getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(long roomNum) {
        this.roomNum = roomNum;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderState='" + orderState + '\'' +
                ", userName='" + userName + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", roomNum=" + roomNum +
                '}';
    }
}
