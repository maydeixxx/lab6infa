package com.sibsutis.devices;

import com.sibsutis.Printable;

public abstract class Device implements Printable {
    int price;
    int id;
    String ip;

    public Device(int id, int price, String ip) {
        this.price = price;
        this.id = id;
        this.ip = ip;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getIp() {
        return ip;
    }

    abstract String getDeviceType();

    @Override
    public String print() {
        String info = "Price: " + price + "\nId: " + id + "\nIp: " + ip + "\nType: " + getDeviceType();
        return info; 
    }

}





