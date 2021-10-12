package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util. *;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> stack = new ArrayDeque<>();

        while(true) {
            System.out.println("Choice 1 : Insert\nChoice 2 : Delete\nChoice 3 : Search\nChoice 4 : Display\nAny other choice : Exit");
            Integer num = Integer.parseInt(br.readLine());

            switch (num) {
                case 1:
                    System.out.println("Enter the element to be inserted");
                    Integer insert = Integer.parseInt(br.readLine());
                    stack.add(insert);
                    break;

                case 2:
                    if(!stack.isEmpty()) {
                        Integer deletion = stack.remove();
                        System.out.println("The element " + deletion + " is deleted from queue");
                    }
                    else{
                        System.out.println("Queue is empty");
                    }
                    break;
                case 3:
                    System.out.println("Enter the value to be search");
                    Integer search = Integer.parseInt(br.readLine());
                    if(stack.contains(search)) {
                        System.out.println("The element " + search + " is present in the stack");
                    }
                    else{
                        System.out.println("The element " + search + " is not present in the stack");
                    }
                    break;

                    case 4:
                        if(!stack.isEmpty()) {
                            System.out.println("The elements in the queue are " + stack);
                        }
                        else{
                            System.out.println("Queue is empty");
                        }
                        break;
                    default:
            }

        }
    }
}
