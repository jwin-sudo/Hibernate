import java.util.regex.*;
class Main{
    public static void main(String args[]){
        System.out.print(Pattern.matches("[a-zA-Z0-9]{6}", "arun32")+" ");
        System.out.print(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32")+" ");
        System.out.print(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2")+" ");
        System.out.print(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2")+" ");
    }
}