package com.qf.entity;

public class UserInfo {
    private long userinfoId;
    private String userName;
    private String hotelName;
    private long roomNum;

    public UserInfo() {
    }

    public UserInfo(long userinfoId, String userName, String hotelName, long roomNum) {
        this.userinfoId = userinfoId;
        this.userName = userName;
        this.hotelName = hotelName;
        this.roomNum = roomNum;
    }

    public long getUserinfoId() {
        return userinfoId;
    }

    public void setUserinfoId(long userinfoId) {
        this.userinfoId = userinfoId;
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
        return "UserInfo{" +
                "userinfoId=" + userinfoId +
                ", userName='" + userName + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", roomNum=" + roomNum +
                '}';
    }
}
