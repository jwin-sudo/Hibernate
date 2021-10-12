package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Choose Event type\n1.Exhibition\n2.Stage Event");
        Integer choice = Integer.parseInt(br.readLine());

        if(choice == 1){
            System.out.println("Enter the details of Exhibition in CSV format");
            String details = br.readLine();
            String[] arr = details.split(",");

            Exhibition ex = new Exhibition(arr[0],arr[1], arr[2], arr[3], Integer.parseInt(arr[4]));
            ex.display();
        }

        else if(choice == 2){
            System.out.println("Enter the details of Stage Event in CSV format");
            String details = br.readLine();
            String[] arr = details.split(",");

            StageEvent ex = new StageEvent(arr[0],arr[1], arr[2], arr[3], Integer.parseInt(arr[4]));
            ex.display();
        }

        else {
            System.out.println("Invalid choice");
        }

    }
}
