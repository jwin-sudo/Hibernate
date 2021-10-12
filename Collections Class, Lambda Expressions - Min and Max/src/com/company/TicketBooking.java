package com.company;

public class TicketBooking implements Comparable<TicketBooking> {
    String customerName;
    Integer price;

    public TicketBooking(){

    }

    public TicketBooking(String customerName, Integer price){
        this.customerName = customerName;
        this.price = price;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public Integer getPrice(){
        return this.price;
    }

    public void setPrice(Integer price){
        this.price = price;
    }

    @Override
    public int compareTo(TicketBooking o) {
        if(this.price == o.price){
            return 0;
        }
        else if(this.price > o.price){
            return 1;
        }
        else{
            return -1;
        }
    }

}
