package com.example.xty.helloagain.MyEntity;

/**
 * Created by kelin on 16-11-18.
 */

public class RoomInfo {
    //对应的是周数
    private String roomType;
    private String roomName;
    private long roomId;

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }
}
