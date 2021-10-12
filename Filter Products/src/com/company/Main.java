package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Product> filteredList = new ArrayList<>();

        System.out.println("Enter the maximum price of the product");
        Double price = Double.parseDouble(br.readLine());


        Product pr = new Product();
        pr.filterProducts(price).forEach(x->filteredList.add(x));

        if(filteredList.isEmpty()){
            System.out.println("No products found within the given price");
        }

        else{
            System.out.println("List of Filtered Products");
            System.out.format("%-20s %-20s %-20s %-10s %s\n","Name","Brand","Category","Color","Price");
            filteredList.forEach((n) -> System.out.format("%-20s %-20s %-20s %-10s %s\n",n.getName(),n.getBrand(),n.getProductCategory(),n.getColor(),n.getPrice()));
        }

    }
}
