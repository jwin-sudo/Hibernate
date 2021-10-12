package com.company;
import java.util.Scanner;
import java.util.ArrayList;
class Main{
    public static void main(String args[])throws Exception{
        //Fill your code here
        Scanner sc = new Scanner(System.in);
        StudentDAO sdao = new StudentDAO();
        ArrayList<Student> students = new ArrayList<>();
        char choice = 'Y';
        while(choice =='Y')
        {
            System.out.println("Enter the department name:");
            String dname = sc.nextLine();
            students = sdao.readData(dname);
            //System.out.println(students.size());
            if(students.size()>0)
                System.out.printf("Students from %s department are:\n",dname);
            else
                System.out.printf("No students in %s department\n",dname);
            for(Student s: students)
            {
                System.out.println(s.getSname());
            }
            System.out.println("Do you want to continue the search(Y/N):");
            choice = Character.toUpperCase(sc.nextLine().charAt(0));
            students.clear();
        }
    }
}