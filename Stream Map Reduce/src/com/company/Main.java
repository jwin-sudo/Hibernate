package com.company;

import java.util. *;
import java.util.stream.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        double food,rent,shopping,groceries,ebBill,salary,total;

        System.out.println("Enter expense for food");
        food = sc.nextDouble();

        System.out.println("Enter expense for rent");
        rent=sc.nextDouble();

        System.out.println("Enter expense for shopping");
        shopping=sc.nextDouble();

        System.out.println("Enter expense for groceries");
        groceries=sc.nextDouble();

        System.out.println("Enter expense for electricity");
        ebBill=sc.nextDouble();

        System.out.println("Enter salary");
        salary=sc.nextDouble();

        ArrayList<Expenses> expenses = new ArrayList<>();
        expenses.add(new Expenses("shopping", shopping));
        expenses.add(new Expenses("rent", rent));
        expenses.add(new Expenses("groceries", groceries));
        expenses.add(new Expenses("ebBill", ebBill));
        expenses.add(new Expenses("food", food));

        double sumExpenses = expenses.stream()
                .map(Expenses::getCost)
                .reduce(0.0,Double::sum);
        if(sumExpenses > salary){
            System.out.println("Expenses exceeds Salary");
        }

        else{
            System.out.println("Savings amount will be Rs." + (salary-sumExpenses));
        }

    }
}
