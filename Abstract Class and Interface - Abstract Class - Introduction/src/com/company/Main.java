package com.company;

import java.util. *;
import java.io. *;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        DecimalFormat df = new DecimalFormat("#.00");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("List of Shapes:\n1.Circle\n2.Rectangle\n3.Square");
        System.out.println("Enter your choice:");
        int num = Integer.parseInt(br.readLine());

        if(num==1) {
            System.out.println("Enter the radius of the Circle:");
            Float radius = Float.parseFloat(br.readLine());
            Circle cir = new Circle(radius);


            System.out.println("The perimeter is " + df.format(cir.calculatePerimeter()));
        }
        else if(num==2) {
            System.out.println("Enter the length of the Rectangle:");
            Float length = Float.parseFloat(br.readLine());

            System.out.println("Enter the breadth of the Rectangle:");
            Float breadth = Float.parseFloat(br.readLine());
            Rectangle rec = new Rectangle(length, breadth);

            System.out.println("The perimeter is " + df.format(rec.calculatePerimeter()));
        }
        else if(num==3){
                System.out.println("Enter the side of the Square:");
                Float side = Float.parseFloat(br.readLine());

                Square square = new Square(side);

                System.out.println("The perimeter is " + df.format(square.calculatePerimeter()));
        }
    }
}
