package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util. *;
public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the side in cm of a square tile");
        Integer side = Integer.parseInt(br.readLine());

        System.out.println("Enter the number of square tiles available");
        Integer numOfTiles = Integer.parseInt(br.readLine());


        int sqrt = (int)(Math.sqrt(numOfTiles));
        int result = (sqrt * sqrt)*(side*side);

        System.out.println("Area of the largest possible square is " + result + " sqcm");
    }
}
