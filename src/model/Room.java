package model;

import java.util.Objects;

public class Room implements IRoom{
    private final Double roomPrice;
    private final String roomNumber;
    private final RoomType roomType;
    private final boolean isFree;

    public Room(String roomNumber, RoomType roomType, Double roomPrice) {
        this.roomPrice = roomPrice;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        if (roomPrice == 0) {
            isFree = true;
        } else {
            isFree = false;
        }
    }

    @Override
    public Double getRoomPrice() {
        return null;
    }

    @Override
    public RoomType getRoomType() {
        return roomType;
    }

    @Override
    public String getRoomNumber() {
        return roomNumber;
    }

    @Override
    public boolean isFree() {
        return isFree;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomPrice=" + roomPrice +
                ", roomNumber='" + roomNumber + '\'' +
                ", roomType=" + roomType +

                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return roomNumber.equals(room.roomNumber) && roomType == room.roomType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomNumber, roomType);
    }
}
