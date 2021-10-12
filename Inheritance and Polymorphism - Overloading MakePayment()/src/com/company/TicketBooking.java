package com.company;

public class TicketBooking {
    String stageEvent;
    String customer;
    Integer noOfSeats;

    public TicketBooking(){

    }

    public TicketBooking(String stageEvent, String customer, Integer noOfSeats){
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    public String getStageEvent(){
        return this.stageEvent;
    }

    public void setStageEvent(String stageEvent){
        this.stageEvent = stageEvent;
    }

    public String getCustomer(){
        return this.customer;
    }

    public void setCustomer(String customer){
        this.customer = customer;
    }

    public Integer getNoOfSeats(){
        return this.noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats){
        this.noOfSeats = noOfSeats;
    }


    public void makePayment(Double amount){
        System.out.println("Amount " + amount + " paid in cash");
    }

    public void makePayment(String walletNumber, Double amount){
        System.out.println("Amount " + amount + " paid using wallet number " + walletNumber);
    }

    public void makePayment(String creditCard, String ccv, String name, Double amount){
        System.out.println("Holder name:" + name);
        System.out.println("Amount " + amount + " paid using Master card");
        System.out.println("CCV:" + ccv);
    }

}
