package com.company;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class Main {

    public static void main(String[] args) {
	// write your code here
        File myObj = new File("input.txt");
        if(myObj.exists()){
            System.out.println("yes");
        }
    }
}
