package com.sibsutis.devices;

public class PC extends Device {
    public PC(int id, int price, String ip) {
        super(id, price, ip);
    }

    @Override
    String getDeviceType() {
        String type = "Personal Computer";
        return type;
    }
}