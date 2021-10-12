package com.company;

import java.util.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
class Main{
    public static void main(String args[])throws Exception{
        //Fill your code here
        Connection c = DBConnection.Connection();
        ArrayList<JobOffer> output = new ArrayList<>();
        Statement st = c.createStatement();
        try{
            st.execute("CREATE TABLE job_offer ( sid int(10), job_title varchar(25),job_description TEXT,company_name varchar(25),package_per_annum DOUBLE, contact varchar(25);");
        }
        catch(Exception e){
            st.execute("DELETE FROM job_offer;");

        }
        JobOfferDAO test = new JobOfferDAO();
        Scanner scan = new Scanner(System.in);
        int sid;
        String jobTitle;
        String job_description;
        String companyName;
        double packagePerAnnum;
        String contact;

        while(true){
            System.out.println("1.Insert");
            System.out.println("2.Select");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.Exit");
            System.out.println("Enter your choice:");
            int choice = scan.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter the Sid:");
                    sid = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter the job title:");
                    jobTitle = scan.nextLine();
                    System.out.println("Enter the job description:");
                    job_description = scan.nextLine();
                    System.out.println("Enter the company name:");
                    companyName = scan.nextLine();
                    System.out.println("Enter the package per annum");
                    packagePerAnnum = scan.nextDouble();
                    System.out.println("Enter the contact:");
                    contact = scan.nextLine();
                    test.insertRecord(new JobOffer(sid,jobTitle,job_description,companyName,packagePerAnnum,contact));
                    System.out.println("Record Inserted");
                    break;
                case 2:
                    if(test.list().isEmpty()){
                        System.out.println("Table is empty");
                        break;
                    }
                    for(JobOffer x:test.list())
                        System.out.println(x);
                    break;
                case 3:
                    System.out.println("Enter the job offer id to be updated:");
                    sid = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter the package per annum");
                    packagePerAnnum = scan.nextDouble();
                    test.update(sid,packagePerAnnum);
                    boolean found = false;
                    for(JobOffer x:test.list())
                        if(x.getSid()==sid){
                            found = true;
                            break;
                        }
                    if(!found){
                        System.out.println("JobOffer Record not found");
                        break;
                    }



                    System.out.println("Records updated");
                    break;
                case 4:
                    System.out.println("Enter the job offer id to be deleted:");
                    sid = scan.nextInt();
                    scan.nextLine();
                    found = false;
                    for(JobOffer x:test.list())
                        if(x.getSid()==sid){
                            found = true;
                            break;
                        }
                    if(!found){
                        System.out.println("Job Offer Record not found");
                        break;
                    }
                    test.delete(sid);
                    System.out.println("Record deleted");
                    break;
                default:
                    return;
            }
        }
    }
}




