package com.assignment;
import java.util.regex.Pattern;

public class ValidationJava {
    public String name(String s)
    {
        boolean pattern = Pattern.matches("[A-Z]{1}[a-z]{2,}",s);
       if (pattern == true){
           System.out.println("Happy- first name validated");
           return s;
       }
       else
       {
           System.out.println("Sad- first name not validated");
           return s;
       }

    }
    public String email(String e )
    {
        boolean pattern = Pattern.matches("([A-Za-z]{1,10}[/.])([A-Za-z]{1,10})?([@][b][l][/.][c][o][/.])([in]{2})?",e);
        if (pattern == true)
        {
            System.out.println("happy - email validated");
            return e;
        }
        else
        {
            System.out.println("sad");
            return e;
        }
    }

    public String phonenum(String p)
    {
        boolean pattern  = Pattern.matches("[9][1]/s([0-9]{10})",p);
        if (pattern == true)
        {
            System.out.println("Happy - phone number validated");
            return p;
        }
        else
        {
            System.out.println("Sad - phone number not validated");
            return p;
        }
    }
     public String password(String pass)
     {
         boolean pattern = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}",pass);
         if (pattern == true)
         {
             System.out.println("Happy - email validated");
             return pass;
         }
         else
         {
             System.out.println("Sad - password not validated");
             return pass;
         }
     }

}
