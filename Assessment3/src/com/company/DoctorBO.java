package com.company;

public class DoctorBO {
    public static void createDoctor(String details) throws InvalidDoctorException {
        //fill your code here
        boolean valid = false;

            if(details.equals("MBBS") || details.equals("BDS") || details.equals("BAMS") || details.equals("BHMS") || details.equals("BYNS")){
                valid = true;
            }

            else{
                throw new InvalidDoctorException(" Invalid doctor qualification");
            }
    }
}

