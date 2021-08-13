package com.luxoft.springioc.lab2.model;

public class Contact {

    String address;

    public Contact(String address) {
        this.address = address;
    }

    public static Contact createInstance(String address) {

        return new Contact(address);
    }

    public String getAddress() {
        return address;
    }
}
