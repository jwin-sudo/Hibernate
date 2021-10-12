package com.company;

import java.util. *;
import java.io. *;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your account number:");
        String acctNumber = br.readLine();

        System.out.println("Enter the balance of the account:");
        Double balance = Double.parseDouble(br.readLine());

        System.out.println("Enter the type of transfer to be made:\n1.NEFT\n2.IMPS\n3.RTGS");
        Integer input = Integer.parseInt(br.readLine());

        if(input == 1){
            System.out.println("Enter the amount to be transferred:");
            Double transferredAmount = Double.parseDouble(br.readLine());

            NEFTTransfer neftTransfer = new NEFTTransfer(acctNumber,balance);

            if(neftTransfer.transfer(transferredAmount) == true && acctNumber.length() == 10){
                System.out.println("Transfer occurred successfully");
                System.out.println("Remaining balance is " + neftTransfer.getBalance());
            }
            else if(neftTransfer.transfer(transferredAmount) == false){
                System.out.println("Transfer could not be made");
            }

            else{
                System.out.println("Account number or transfer amount seems to be wrong");
            }
        }

        else if(input == 2){
            System.out.println("Enter the amount to be transferred:");
            Double transferredAmount2 = Double.parseDouble(br.readLine());

            IMPSTransfer impsTransfer = new IMPSTransfer(acctNumber,balance);

            if(impsTransfer.transfer(transferredAmount2) == true && acctNumber.length() == 10){
                System.out.println("Transfer occurred successfully");
                System.out.println("Remaining balance is " + impsTransfer.getBalance());
            }
            else{
                System.out.println("Account number or transfer amount seems to be wrong");
            }
        }

        else if(input == 3){
            System.out.println("Enter the amount to be transferred:");
            Double transferredAmount = Double.parseDouble(br.readLine());

            RTGSTransfer rtgsTransfer = new RTGSTransfer(acctNumber,balance);

            if(rtgsTransfer.transfer(transferredAmount) == true && acctNumber.length() == 10){
                System.out.println("Transfer occurred successfully");
                System.out.println("Remaining balance is " + rtgsTransfer.getBalance());
            }
            else if(rtgsTransfer.transfer(transferredAmount) == false){
                System.out.println("Transfer could not be made");

            }
            else{
                System.out.println("Account number or transfer amount seems to be wrong");
            }
        }
        else{
            System.out.println("Invalid choice");
        }

    }


}
