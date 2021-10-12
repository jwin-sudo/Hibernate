package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util. *;
import java.util.Date;
import java.time.LocalDate;
import java.util.stream.Collectors;

public class Main{
    public static void main(String args[]) throws IOException, ParseException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arr = new ArrayList<>();

        System.out.println("Enter the number of dates");
        Integer num = Integer.parseInt(br.readLine());

        if(num < 0){
            System.out.println("Invalid input");
        }

        else {
            System.out.println("Enter dates of the events:(dd/MM/yyyy)");
            for (int i = 0; i < num; i++) {
                String date = br.readLine();
                SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
                Date dt1 = format1.parse(date);
                DateFormat format2 = new SimpleDateFormat("EEEE");
                String finalDay = format2.format(dt1);
                arr.add(finalDay);
            }
        }

        String mostRepeatedWord = arr.stream()
                .collect(Collectors.groupingBy(w->w,Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .get()
                .getKey();



            System.out.println("More number of events takes place on " + mostRepeatedWord);


    }
}