package com.company;

public class WeakPasswordException extends Exception{
    //Your code here
    private String exception;
    WeakPasswordException(String exception){
        this.exception = exception;
    }
    public String toString() {
        return "WeakPasswordException: "+exception;
    }
}
