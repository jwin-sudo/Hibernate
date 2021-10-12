package com.company;

import java.io.*;
import java.util. *;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the airport");
        String airport = sc.nextLine();
        System.out.println("Enter the city name");
        String city = sc.nextLine();
        System.out.println("Enter the country code");
        String country = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(airport);
        sb.append(",");
        sb.append(city);
        sb.append(",");
        sb.append(country);
        sb.append("\n");
        try (PrintWriter writer = new PrintWriter(new File("airport.csv"))) {
            writer.write(sb.toString());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
