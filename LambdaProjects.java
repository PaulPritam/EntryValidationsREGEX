package com.lambdaassignments;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface Validate
{
    public boolean validator(String regex, String inputs);
}
public class LambdaProjects {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nenter the first name ");
        String fname = sc.next();
        System.out.println("\nenter the last name ");
        String lname = sc.next();
        System.out.println("\nenter email ");
        String email = sc.next();
        System.out.println("\nenter phone number ");
        String phonenum = sc.next();
        System.out.println("\nenter password ");
        String pass = sc.next();



        String fnameregex = "[A-Z]{1}[a-z]{2,}";
        String lnameregex = "[A-Z]{1}[a-z]{2,}";
        String emailregex = "([A-Za-z]{1,10}[/.])([A-Za-z]{1,10})?([@][b][l][/.][c][o][/.])([in]{2})?";
        String phonenumregex = "[9][1]/s([0-9]{10})";
        String passregex = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?!.*[<>`])(?=[^.,:;'!@#$%^&_+=|(){}[?\-\]\/\][.,:;'!@#$%^&*_+=|(){}[?\-\]\/\][^.,:;'!@#$%^&_+=|(){}[?\-\]\/\]$).{8}$";
        Pattern.compile(fnameregex);
        Pattern.compile(lnameregex);
        Pattern.compile(emailregex);
        Pattern.compile(phonenumregex);
        Pattern.compile(passregex);

        Validate firstname = (regex, inputs) ->Pattern.matches(fnameregex,fname);
        Validate lastname = (regex, inputs) ->Pattern.matches(lnameregex,lname);
        Validate emailid = (regex, inputs) ->Pattern.matches(emailregex,email);
        Validate phonenumber = (regex, inputs) ->Pattern.matches(phonenumregex,phonenum);
        Validate password = (regex, inputs) ->Pattern.matches(passregex,pass);

        boolean fnamechecker = firstname.validator(fnameregex,fname);
        boolean lnamechecker = lastname.validator(lnameregex,lname);
        boolean emailchecker = emailid.validator(emailregex,lname);
        boolean phonenumchecker = phonenumber.validator(phonenumregex,lname);
        boolean passwordchecker = password.validator(passregex,pass);

        System.out.println("\nthe firstname is "+fnamechecker);
        System.out.print("\nthe last name is "+lnamechecker);
        System.out.print("\nthe email is "+emailchecker);
        System.out.print("\nthe phone number is " +phonenumchecker);
        System.out.print("\nthe password is " +passwordchecker);



    }
}