package com.example.myamaptestdemo.data;

import androidx.room.ColumnInfo;

public class Address {
    public String street;
    public String state;
    public String city;

    @ColumnInfo(name = "post_code")
    public int postCode;
}
