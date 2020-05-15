package com.itahari.sms.iic.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private String sid;
    private String name;
    private String address;
    private String phone_number;

    public Student() {
    }

    public Student(String sid, String name, String address, String phone_number) {
        this.sid = sid;
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getphone_number() {
        return phone_number;
    }

    public void setphone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "Student { Name: " + name +", Address: " + address + ", Phone Number: " + phone_number + "}";
    }
}
