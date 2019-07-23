package com.qf.entity;

public class Hotel {
    private long hotelId;
    private String hotelName;
    private String hotelAddr;
    private String hotelPhone;

    public Hotel() {
    }

    public Hotel(long hotelId, String hotelName, String hotelAddr, String hotelPhone) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.hotelAddr = hotelAddr;
        this.hotelPhone = hotelPhone;
    }

    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelAddr() {
        return hotelAddr;
    }

    public void setHotelAddr(String hotelAddr) {
        this.hotelAddr = hotelAddr;
    }

    public String getHotelPhone() {
        return hotelPhone;
    }

    public void setHotelPhone(String hotelPhone) {
        this.hotelPhone = hotelPhone;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                ", hotelAddr='" + hotelAddr + '\'' +
                ", hotelPhone='" + hotelPhone + '\'' +
                '}';
    }
}
