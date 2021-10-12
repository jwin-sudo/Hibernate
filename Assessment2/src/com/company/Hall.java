package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hall {
    String name;
    Long contactNumber;
    Double costPerDay;
    String ownerName;
    String bookingDate;

    public Hall() {

    }

    public Hall(String name, Long contactNumber, Double costPerDay, String ownerName, String bookingDate) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.costPerDay = costPerDay;
        this.ownerName = ownerName;
        this.bookingDate = bookingDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public boolean equals(Hall obj1, Hall obj2) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = formatter.parse(obj1.bookingDate);
        Date date2 = formatter.parse(obj2.bookingDate);


        if(obj1.name.equals(obj2.name) && obj1.contactNumber.equals(obj2.contactNumber)
        && obj1.costPerDay.equals(obj2.costPerDay) && obj1.ownerName.equals(obj2.ownerName)
        && date1.equals(date2)){
            return true;
        }
        else{
            return false;
        }
    }
}
