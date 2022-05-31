package com.example.myapplication;

public class Bus {
    int bus_number;
    String name_driver;
    String lastname_driver, phonenumber_driver;
    int capacity_of_bus;

    public Bus(int bus_number, String name_driver, String lastname_driver, String phonenumber_driver, int capacity_of_bus) {
        this.bus_number = bus_number;
        this.name_driver = name_driver;
        this.lastname_driver = lastname_driver;
        this.phonenumber_driver = phonenumber_driver;
        this.capacity_of_bus = capacity_of_bus;
    }

    public int getBus_number() {
        return bus_number;
    }

    public void setBus_number(int bus_number) {
        this.bus_number = bus_number;
    }

    public String getName_driver() {
        return name_driver;
    }

    public void setName_driver(String name_driver) {
        this.name_driver = name_driver;
    }

    public String getLastname_driver() {
        return lastname_driver;
    }

    public void setLastname_driver(String lastname_driver) {
        this.lastname_driver = lastname_driver;
    }

    public String getPhonenumber_driver() {
        return phonenumber_driver;
    }

    public void setPhonenumber_driver(String phonenumber_driver) {
        this.phonenumber_driver = phonenumber_driver;
    }

    public int getCapacity_of_bus() {
        return capacity_of_bus;
    }

    public void setCapacity_of_bus(int capacity_of_bus) {
        this.capacity_of_bus = capacity_of_bus;
    }
}
