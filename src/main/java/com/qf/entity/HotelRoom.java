package com.qf.entity;

public class HotelRoom {
    private long roomId;
    private long roomNum;
    private long hotelId;
    private String hotelName;

    public HotelRoom() {
    }

    public HotelRoom(long roomId, long roomNum, long hotelId, String hotelName) {
        this.roomId = roomId;
        this.roomNum = roomNum;
        this.hotelId = hotelId;
        this.hotelName = hotelName;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public long getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(long roomNum) {
        this.roomNum = roomNum;
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

    @Override
    public String toString() {
        return "HotelRoom{" +
                "roomId=" + roomId +
                ", roomNum=" + roomNum +
                ", hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                '}';
    }
}
