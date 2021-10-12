package com.company;

import java.io. *;
import java.util. *;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);


            System.out.println("Choose Account Type\n1.Savings Account\n2.Current Account");
            int num = sc.nextInt();
            String dummy = sc.nextLine();

            switch(num){
                case 1:
                    System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
                    String accDetails = sc.nextLine();

                    String[] arr = accDetails.split(",");

                    SavingsAccount savingAcc = new SavingsAccount(arr[0], arr[1], arr[2], arr[3]);
                    savingAcc.display();
                    break;
                case 2:
                    System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");
                    String accDetails2 = sc.nextLine();

                    String[] arr2 = accDetails2.split(",");

                    CurrentAccount currentAcc = new CurrentAccount(arr2[0], arr2[1], arr2[2], arr2[3]);
                    currentAcc.display();
                    break;

            }
    }
}
