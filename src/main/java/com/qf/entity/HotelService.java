package com.qf.entity;

import java.io.Serializable;

public class HotelService implements Serializable {
    private Long serviceId;
    private String serviceName;
    private Long roomNum;
    private String hotelName;
    private Long phone;
    private int serviceFlag;

    public HotelService() {
    }

    public HotelService(Long serviceId, String serviceName, Long roomNum, String hotelName,Long phone, int serviceFlag) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.roomNum = roomNum;
        this.hotelName = hotelName;
        this.phone = phone;
        this.serviceFlag = serviceFlag;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Long getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Long roomNum) {
        this.roomNum = roomNum;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public int getServiceFlag() {
        return serviceFlag;
    }

    public void setServiceFlag(int serviceFlag) {
        this.serviceFlag = serviceFlag;
    }

    @Override
    public String toString() {
        return "HotelService{" +
                "serviceId=" + serviceId +
                ", serviceName='" + serviceName + '\'' +
                ", roomNum=" + roomNum +
                ", hotelName='" + hotelName + '\'' +
                ", phone=" + phone +
                ", serviceFlag=" + serviceFlag +
                '}';
    }
}
