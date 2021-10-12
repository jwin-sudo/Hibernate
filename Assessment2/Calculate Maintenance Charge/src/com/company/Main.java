package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Menu\n1.Current Account\n2.Savings Account");
        Integer input = Integer.parseInt(br.readLine());


            if(input == 1) {
                System.out.println("Enter the account details(name,accountNumber,accountBalance,year)");
                String accountDetails = br.readLine();
                String[] accountDetailsToArr = accountDetails.split(",");

                Account obj = new Account(accountDetailsToArr[0], accountDetailsToArr[1], Double.parseDouble(accountDetailsToArr[2]));

                CurrentAccount currObj = new CurrentAccount(accountDetailsToArr[0], accountDetailsToArr[1], Double.parseDouble(accountDetailsToArr[2]));

                System.out.println("Maintenance Charge For Current Account " + currObj.computeMaintainanceCharge(Integer.parseInt(accountDetailsToArr[3])));
            }

            else if(input ==  2) {
                System.out.println("Enter the account details(name,accountNumber,accountBalance,year)");
                String accountDetails2 = br.readLine();
                String[] accountDetailsToArr2 = accountDetails2.split(",");

                Account obj2 = new Account(accountDetailsToArr2[0], accountDetailsToArr2[1], Double.parseDouble(accountDetailsToArr2[2]));

                SavingAccount savObj = new SavingAccount(accountDetailsToArr2[0], accountDetailsToArr2[1], Double.parseDouble(accountDetailsToArr2[2]));

                System.out.println("Maintenance Charge For Saving Account " + savObj.computeMaintainanceCharge(Integer.parseInt(accountDetailsToArr2[3])));
            }
    }
}
