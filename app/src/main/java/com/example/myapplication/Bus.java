package com.example.myapplication;

public class Bus {
    int bus_number;
    String id_driver;

    public Bus(int bus_number, String id_driver) {
        this.bus_number = bus_number;
        this.id_driver = id_driver;
    }

    public int getBus_number() {
        return bus_number;
    }

    public void setBus_number(int bus_number) {
        this.bus_number = bus_number;
    }

    public String getId_driver() {
        return id_driver;
    }

    public void setId_driver(String id_driver) {
        this.id_driver = id_driver;
    }

}
