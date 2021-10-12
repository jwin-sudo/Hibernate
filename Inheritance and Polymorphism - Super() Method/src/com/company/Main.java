package com.company;

import java.text.ParseException;
import java.util. *;
import java.io. *;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args) throws ParseException, IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);

        System.out.println("Enter your choice:\n1.Exhibition event\n2.Stage event");
        int num = Integer.parseInt(br.readLine());
        //String dummy = br.readLine();

        if(num == 1) {

            System.out.println("Enter the details of exhibition:");
            String exhibitionDetails = br.readLine();
            String[] arr = exhibitionDetails.split(",");

            Event obj = new Event(arr[0], arr[1], arr[2], arr[3], Double.parseDouble(arr[4]));

            System.out.println("Enter the starting date of the event:");
            String startingDate = br.readLine();
            Date firstDate = sdf.parse(startingDate);

            System.out.println("Enter the ending date of the event:");
            String endingDate = br.readLine();
            Date secondDate = sdf.parse(endingDate);

            long diffInMilly = Math.abs(secondDate.getTime() - firstDate.getTime());
            long diff = TimeUnit.DAYS.convert(diffInMilly, TimeUnit.MILLISECONDS);

            Double output = diff * Double.parseDouble(arr[4]) * .05;

            System.out.println("The GST to be paid is Rs." + output);

        }
        if(num==2) {

            System.out.println("Enter the details of stage event:");
            String stageDetails = br.readLine();
            String[] arr2 = stageDetails.split(",");

            Event obj2 = new Event(arr2[0], arr2[1], arr2[2], arr2[3], Double.parseDouble(arr2[4]));

            System.out.println("Enter the starting date of the event:");
            String srtDate = br.readLine();
            Date fstDate = sdf.parse(srtDate);

            System.out.println("Enter the ending date of the event:");
            String endDate = br.readLine();
            Date secDate = sdf.parse(endDate);

            long diffBetweenDates = Math.abs(secDate.getTime() - fstDate.getTime());
            long difference = TimeUnit.DAYS.convert(diffBetweenDates, TimeUnit.MILLISECONDS);

            Double outcome = difference * Double.parseDouble(arr2[4]) * .15;

            System.out.println("The GST to be paid is Rs." + outcome);
        }

    }
}



