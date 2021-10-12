package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;
import java.util. *;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();
        File fileName = new File("input.txt");



        Stream<String> text = Files.lines(fileName.toPath());


        System.out.printf("%-10s %-15s\n", "Name", "Salary");
        text.stream().forEach(y->System.out.print(y));
        text.close();
    }
}
