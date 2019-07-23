package com.qf.entity;

public class HardWare {
    private long hardwareId;
    private String hardwareName;
    private String hardwareState;
    private String hotelName;
    private long roomNum;

    public HardWare() {
    }

    public HardWare(long hardwareId, String hardwareName, String hardwareState, String hotelName, long roomNum) {
        this.hardwareId = hardwareId;
        this.hardwareName = hardwareName;
        this.hardwareState = hardwareState;
        this.hotelName = hotelName;
        this.roomNum = roomNum;
    }

    public long getHardwareId() {
        return hardwareId;
    }

    public void setHardwareId(long hardwareId) {
        this.hardwareId = hardwareId;
    }

    public String getHardwareName() {
        return hardwareName;
    }

    public void setHardwareName(String hardwareName) {
        this.hardwareName = hardwareName;
    }

    public String getHardwareState() {
        return hardwareState;
    }

    public void setHardwareState(String hardwareState) {
        this.hardwareState = hardwareState;
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
        return "HardWare{" +
                "hardwareId=" + hardwareId +
                ", hardwareName='" + hardwareName + '\'' +
                ", hardwareState='" + hardwareState + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", roomNum=" + roomNum +
                '}';
    }
}
