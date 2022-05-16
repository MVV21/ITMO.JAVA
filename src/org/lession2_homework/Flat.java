package org.lession2_homework;

public class Flat {
    private int numOfRooms;
    private double area;
    private int floor;
    private WC wc;
    private boolean isBalcony;
    private boolean isStorageRoom;
    private double ceilingHeight;
    private long price;

    public Flat() {
    }

    public Flat(int numOfRooms, double area, int floor, WC wc, boolean isBalcony, boolean isStorageRoom, double ceilingHeight, long price) {
        this.numOfRooms = numOfRooms;
        this.area = area;
        this.floor = floor;
        this.wc = wc;
        this.isBalcony = isBalcony;
        this.isStorageRoom = isStorageRoom;
        this.ceilingHeight = ceilingHeight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "numOfRooms=" + numOfRooms +
                ", area=" + area +
                ", floor=" + floor +
                ", wc=" + wc +
                ", isBalcony=" + isBalcony +
                ", isStorageRoom=" + isStorageRoom +
                ", ceilingHeight=" + ceilingHeight +
                ", price=" + price +
                '}';
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public WC getWc() {
        return wc;
    }

    public void setWc(WC wc) {
        this.wc = wc;
    }

    public boolean isBalcony() {
        return isBalcony;
    }

    public void setBalcony(boolean balcony) {
        isBalcony = balcony;
    }

    public boolean isStorageRoom() {
        return isStorageRoom;
    }

    public void setStorageRoom(boolean storageRoom) {
        isStorageRoom = storageRoom;
    }

    public double getCeilingHeight() {
        return ceilingHeight;
    }

    public void setCeilingHeight(double ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
