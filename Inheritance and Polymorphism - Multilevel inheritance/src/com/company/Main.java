package com.company;

import java.util. *;
import java.io. *;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Choose Stall Type\n1.Silver Stall\n2.Gold Stall\n3.Platinum Stall");
        Integer input = Integer.parseInt(br.readLine());
        //String dummy = br.readLine();

        if (input == 1) {
            System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost)");
            String stallDetail = br.readLine();
            String[] stallDetailStr = stallDetail.split(",");
            SilverStall aSilverStall = new SilverStall(stallDetailStr[0], stallDetailStr[1], stallDetailStr[2], Integer.parseInt(stallDetailStr[3]));

            System.out.println(aSilverStall.toString());
        } else if (input == 2) {
            System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost,Number of TV set)");
            String stallDetail2 = br.readLine();
            String[] stallDetailStr2 = stallDetail2.split(",");
            GoldStall aGoldStall = new GoldStall(stallDetailStr2[0], stallDetailStr2[1], stallDetailStr2[2], Integer.parseInt(stallDetailStr2[3]), Integer.parseInt(stallDetailStr2[4]));

            System.out.println(aGoldStall.toString());
        } else if (input == 3) {

            System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost,Number of TV set,Number of Projectors)");
            String stallDetail3 = br.readLine();
            String[] stallDetailStr3 = stallDetail3.split(",");
            PlatinumStall aPlatinumStall = new PlatinumStall(stallDetailStr3[0], stallDetailStr3[1], stallDetailStr3[2], Integer.parseInt(stallDetailStr3[3]), Integer.parseInt(stallDetailStr3[4]),
                    Integer.parseInt(stallDetailStr3[5]));

            System.out.println(aPlatinumStall.toString());
        }
    }
}