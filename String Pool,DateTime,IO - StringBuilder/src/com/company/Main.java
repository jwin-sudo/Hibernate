package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang. *;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        System.out.println("Enter the code");
        String code = br.readLine();

        sb.append(code);

        if(sb.substring(0,2).equals("DH")){
            sb.replace(0,2, "DEL");
        }

        else if(sb.substring(0,2).equals("MB")){
            sb.replace(0,2, "MUB");
        }

        else if(sb.substring(0,2).equals("KL")){
            sb.replace(0, 2, "KOL");
        }

        while(sb.length() < 8){
            sb.insert(3,"0");
            if(sb.length() == 8){
                break;
            }
        }


        System.out.println("Formatted code\n" + sb.toString());



    }
}
