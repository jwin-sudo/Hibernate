package com.company;

public class MovieRating extends Thread{
    String ratings;
    Integer count;

    public MovieRating() { }

    public MovieRating(String ratings) {
        this.ratings = ratings;
        this.count = 0;
    }

    public Integer getCount(){
        return count;
    }

    synchronized Integer rating(String input){
        String number[] = input.split(",");
        for(int i = 0; i< number.length;i++){
            Integer stringToInt = Integer.parseInt(number[i]);
            count = count + stringToInt;
        }
        return  count;
    }

    public void run() {
        //Fill your code here
        this.rating(ratings);
    }
}
