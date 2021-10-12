package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        Integer n = sc.nextInt();

        Integer[] arr = new Integer[n];
        Double[] arr2 = new Double[n];

        System.out.println("Enter integers one by one");
        for(int i = 0; i<n;i++){
            arr[i] = Integer.parseInt(sc.nextLine());

        }

        for(int i = 0; i<n;i++){
            arr2[i] = Double.parseDouble(sc.nextLine());
        }

        printArray(arr);
        printArray(arr2);



    }

    public static <E extends Number>void printArray(E[] elements) {
        Arrays.sort(elements);
        for (E element : elements) {
            System.out.format("%s\n", element);
        }
    }
}
