package com.nitin;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String address;
    private String zipcode;

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
