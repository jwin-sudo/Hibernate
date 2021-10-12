package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        Map<String,Map<String,Integer>> map = new HashMap<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of address:");
        Integer num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++){
            System.out.println("Enter the address:");
            String address = br.readLine();
            String[] arr = address.split(",");
            map.put(arr[2], new HashMap<arr[1], arr[1].codePointCount()>())
        }

        System.out.println("Number of entries in city/state wise:");
    }
}
