package com.company;

public class UserBO {
    //Your code here
    public static void validate(User u) throws WeakPasswordException{
        boolean weak = false;
        //min 10 characters and max 20 character
        //at least one digit
        //at least one spec. char
        //at least one letter
        String pwd = u.getPassword();
        int len = pwd.length();
        boolean length = pwd.length()<10 || pwd.length()>20;
        if(length)
        {
            weak = true;
        } else {
            //boolean noDigit = false, noLetter = false, noSpecial = false;
            char[] arr = pwd.toCharArray();
            int countL = 0, countD = 0, countS = 0;
            for(int i = 0; i < len; i++)
            {
                if(Character.isLetter(arr[i]))
                {
                    countL++;
                } else if(Character.isDigit(arr[i]))
                {
                    countD++;
                } else //if (Character.getNumericValue(arr[i])<47 && Character.getNumericValue(arr[i])>33)
                {
                    countS++;
                }
            }
            if(countL==0 || countD == 0 || countS == 0)
            {
                weak = true;
            }
        }
        if(weak)
            throw new WeakPasswordException("Your password is weak");
    };
}
