package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the ratings");
        //Fill your code here
        String input = br.readLine();
        String[] arr = input.split(",");


        ArrayList<MovieRating> l = new ArrayList<>();
        MovieRating a = new MovieRating(input);
        l.add(a);
        a.start();

        int i =0;
        while(true){
            while(l.get(i).isAlive()){
                continue;
            }


        }
        System.out.printf("Rating: ", avg);

    }
}