package com.company;

import java.lang.reflect.Array;
import java.util. *;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Article> l = new ArrayList<>();
        int count = 0;
        for(int i =1;i<=n;i++){
            System.out.println("Enter line " + i);
            String s = sc.nextLine();
            Article a = new Article(s);
            l.add(a);
            a.start();
        }
        int i =0;
        while(i<n){
            while(l.get(i).isAlive()){
                continue;
            }
            count+=l.get(i).getCount();
            i++;
        }
        System.out.printf("There are %d articles in the given input\n", count);

    }
}
