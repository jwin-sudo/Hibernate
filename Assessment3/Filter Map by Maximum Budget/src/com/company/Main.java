package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> filteredList = new ArrayList<>();

        System.out.println("Enter the maximum budget");
        Double budget = Double.parseDouble(br.readLine());

        Electronic elec = new Electronic();
        //elec.getItemsWithinBudget(budget).forEach(x-> filteredList.add(x));



            System.out.println("List of Electronics");
            System.out.format("%-25s %s\n", "Name", "Cost");
            elec.getItemsWithinBudget(budget);

    }
}
