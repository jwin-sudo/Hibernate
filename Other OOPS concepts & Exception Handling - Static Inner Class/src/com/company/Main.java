package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util. *;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        Shape sh = new Shape();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the shape\n1.Rectangle\n2.Triangle");
        int num = Integer.parseInt(br.readLine());

        if(num==1) {
            System.out.println("Enter the length and breadth:");
            double length = Double.parseDouble(br.readLine());
            double breadth = Double.parseDouble(br.readLine());

            sh.value1 = length;
            sh.value2 = breadth;
            Shape.Inner_Rectangle area = new Shape.Inner_Rectangle();

            System.out.format("Area of rectangle is %.2f ", area.computeRectangleArea());
        }

        else if(num==2){
            System.out.println("Enter the base and height:");
            double base = Double.parseDouble(br.readLine());
            double height = Double.parseDouble(br.readLine());

            sh.value1 = base;
            sh.value2 = height;
            Shape.Inner_Triangle area = new Shape.Inner_Triangle();
            System.out.format("Area of triangle is %.2f ", area.computeTriangleArea());
        }

        else{
            System.out.println("Invalid choice");
        }
    }
}
