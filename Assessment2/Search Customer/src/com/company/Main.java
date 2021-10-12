package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        List<Customer> listObj = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String res= "y";
        while(res.equals("y")){
            System.out.println("Menu\n1.Add Customer\n2.Display Customer\n3.Search Customer\nEnter your choice");
            Integer input = Integer.parseInt(br.readLine());

            String details= "";

            if(input == 1) {
                System.out.println("Enter the Customer details in CSV format");
                details = br.readLine();
                String[] arr = details.split(",");
                Customer obj= new Customer(arr[0], arr[1], arr[2]);
                listObj.add(obj);
                CustomerBO objBO = new CustomerBO(arr[0], arr[1], arr[2]);
                objBO.createCustomer(details,listObj);

                System.out.println("Do you want to continue(y/n)?:");
                res = br.readLine();
            }
            else if(input == 2){

                String[] arr2 = details.split(",");
                CustomerBO objBO2 = new CustomerBO(arr2[0], arr2[1], arr2[2]);
                objBO2.display(listObj);


            }
            else{
                System.out.println("Invalid choice");
            }
        }

    }
}
