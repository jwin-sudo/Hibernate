
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer num = Integer.parseInt(br.readLine());
        if(num<1 || num > 1000000){
            System.out.println("Invalid Input");
            return;
        }
        Integer trio = 0;
        Integer total = 0;
        Integer count = 0;
        while(trio < num){
            trio++;
            for(int i = 1; i<=trio;i++){
                count++;
                Integer number = count*2;
                if(trio == num){
                    total+=number;
                }
            }
        }
        System.out.println(total);
    }
}

