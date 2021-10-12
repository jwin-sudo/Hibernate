package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose Stall Type\n1)Gold Stall\n2)Premium Stall\n3)Executive Stall");
        int num = Integer.parseInt(br.readLine());

        if(num==1){
            System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
            String stallDetails = br.readLine();
            String[] stallDetailsToStr = stallDetails.split(",");
            GoldStall goldStall = new GoldStall(stallDetailsToStr[0],Integer.parseInt(stallDetailsToStr[1]),stallDetailsToStr[2], Integer.parseInt(stallDetailsToStr[3]));
            goldStall.display();
        }

        else if(num==2){
            System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
            String stallDetails = br.readLine();
            String[] stallDetailsToStr = stallDetails.split(",");
            PremiumStall premiumStall = new PremiumStall(stallDetailsToStr[0],Integer.parseInt(stallDetailsToStr[1]),stallDetailsToStr[2], Integer.parseInt(stallDetailsToStr[3]));
            premiumStall.display();
        }

        else if(num==3){
            System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");
            String stallDetails = br.readLine();
            String[] stallDetailsToStr = stallDetails.split(",");
            ExecutiveStall executiveStallStall = new ExecutiveStall(stallDetailsToStr[0],Integer.parseInt(stallDetailsToStr[1]),stallDetailsToStr[2], Integer.parseInt(stallDetailsToStr[3]));
            executiveStallStall.display();
        }
        else{
            System.out.println("Invalid Stall Type");
        }
    }
}
