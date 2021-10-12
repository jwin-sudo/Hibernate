package com.company;


class InvalidDoctorException extends Exception{
    //fill your code heres
    private String exception;

    InvalidDoctorException(String exception){
        this.exception = exception;
    }

    public String toString(){
        return "InvalidDoctorException:" + exception;
    }

}

