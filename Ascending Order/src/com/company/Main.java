package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;
import java.io. *;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        ArrayList<String> arr = new ArrayList<>();
        
        if(input < 0 ){
            System.out.println("Invalid Input");
        }
        else {
            int counter = 0;
            String firstLetter= "";
            for (int i = 0; i < input; i++) {
                firstLetter = br.readLine();

                if(Character.isLowerCase(firstLetter.charAt(0))){
                    System.out.println("Invalid Input");
                    break;
                }
                arr.add(firstLetter);
                counter++;
            }
            
            if(counter != input){
                System.out.println("Invalid Input");
            }

            else {
                for(int i = 0; i < input; i++){
                    for(int j = i+1; j<input;j++){
                        if(arr.get(i).compareTo(arr.get(j)) >0){
                            String temp = arr.get(i);
                            arr.get(i) = arr.get(j);
                            arr.get(j) = temp;
                        }
                    }
                }
            }
        }
    }
}
