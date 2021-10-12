package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the values for length, width and depth :");
        Integer length = Integer.parseInt(br.readLine());
        Integer width = Integer.parseInt(br.readLine());
        Integer depth = Integer.parseInt(br.readLine());

        Box<Integer,Integer,Integer> integerBox = new Box<>();
        integerBox.addLength(length);
        integerBox.addWidth(width);
        integerBox.addDepth(depth);

        integerBox.print();
    }
}
