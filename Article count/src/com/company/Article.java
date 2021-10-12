package com.company;

public class Article extends Thread {
    String line;
    Integer count;

    public Article(){

    }
    public Article(String l){
        this.line = l;
        this.count = 0;
    }

    public Integer getCount(){
        return count;
    }

    synchronized void calcCount(String l){
        String words[] = l.split(" ");
        for(int i = 0; i<words.length;i++){
            if (words[i].equals("a") || words[i].equals("an") ||
                    words[i].equals("A") || words[i].equals("An") || words[i].equals("the") ||
                    words[i].equals("The")) {
                count++;
            }
        }
    }
    public void run(){
        this.calcCount(line);
    }
}
