package com.example.jaro.otwartewniedziele.Database;

import java.sql.Time;

public class ShopData {
    private int Id;
    public String PostCode;
    public String City;
    public String Name;
    public int BuldingNumber;
    public int LocalNumber;
    public String StreetName;
    public boolean Alcohol;
    public Time OpenHouer;
    public Time CloseHouer;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getPostCode() {
        return PostCode;
    }

    public void setPostCode(String postCode) {
        PostCode = postCode;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBuldingNumber() {
        return BuldingNumber;
    }

    public void setBuldingNumber(int buldingNumber) {
        BuldingNumber = buldingNumber;
    }

    public int getLocalNumber() {
        return LocalNumber;
    }

    public void setLocalNumber(int localNumber) {
        LocalNumber = localNumber;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String streetName) {
        StreetName = streetName;
    }

    public boolean isAlcohol() {
        return Alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        Alcohol = alcohol;
    }

    public Time getOpenHouer() {
        return OpenHouer;
    }

    public void setOpenHouer(Time openHouer) {
        OpenHouer = openHouer;
    }

    public Time getCloseHouer() {
        return CloseHouer;
    }

    public void setCloseHouer(Time closeHouer) {
        CloseHouer = closeHouer;
    }
}
