package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no. of Books");
            Integer looper = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the book details in CSV format");
            for(int i =0;i<looper;i++){
                String[] details = sc.nextLine().split(",");
                new Book(details[0],details[1], details[2], Double.parseDouble(details[3]));
            }
            List<Book> distinctBookList = Book.all()

        }

    }
    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor){
        Map<Object,Boolean> map = new ConcurrentHashMap<>();
        return t ->map.putIfAbsent(keyExtractor.apply(t),Boolean.TRUE) == null;
    }
}
