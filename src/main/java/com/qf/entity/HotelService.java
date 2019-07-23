package com.qf.entity;

public class HotelService {
    private long serviceId;
    private String serviceName;
    private long roomNum;
    private String hotelName;

    public HotelService() {
    }

    public HotelService(long serviceId, String serviceName, long roomNum, String hotelName) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.roomNum = roomNum;
        this.hotelName = hotelName;
    }

    public long getServiceId() {
        return serviceId;
    }

    public void setServiceId(long serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public long getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(long roomNum) {
        this.roomNum = roomNum;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    @Override
    public String toString() {
        return "HotelService{" +
                "serviceId=" + serviceId +
                ", serviceName='" + serviceName + '\'' +
                ", roomNum=" + roomNum +
                ", hotelName='" + hotelName + '\'' +
                '}';
    }
}
