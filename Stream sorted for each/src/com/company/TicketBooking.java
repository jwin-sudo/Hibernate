package com.company;

public class TicketBooking {
    String customerName;
    Integer noOfTickets;
    Double price;

    public TicketBooking(){

    }

    public TicketBooking(String customerName, Integer noOfTickets, Double price){
        this.customerName = customerName;
        this.noOfTickets = noOfTickets;
        this.price = price;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public Integer getNoOfTickets(){
        return this.noOfTickets;
    }

    public void setNoOfTickets(Integer noOfTickets){
        this.noOfTickets = noOfTickets;
    }

    public Double getPrice(){
        return this.price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public String toString(){
        return String.format("%-10s %-15s %-15s", customerName, noOfTickets, price);
    }

}
