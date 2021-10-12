package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util. *;
import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception {
        //fill your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter the doctor details(name,email,mobile number,qualification,experience)");
            String input = br.readLine();
            String[] inputToArr = input.split(",");
            Doctor doctor = new Doctor(inputToArr[0], inputToArr[1], inputToArr[2], inputToArr[3], Integer.parseInt(inputToArr[4]));

            DoctorBO obj = new DoctorBO();
            obj.createDoctor(inputToArr[3]);



            System.out.println(doctor.toString());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

