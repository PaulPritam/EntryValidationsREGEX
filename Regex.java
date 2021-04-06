package patterns;

import java.util.*;
import java.util.regex.*;

public class Regex {
	public static boolean name(String t) {

		Pattern p = Pattern.compile("[A-Z]{1}[a-z]{2,}");
		Matcher m = p.matcher(t);
		return (m.find() && m.group().equals(t));
	}

	public static boolean email(String e) {

		Pattern p = Pattern.compile("([A-Za-z]{1,10}[\\.])([A-Za-z]{1,10})?([@][b][l][\\.][c][o][\\.])([in]{2})?");
		Matcher m = p.matcher(e);
		return (m.find() && m.group().equals(e));
	}

	public static boolean phonenumber(String q) {

		Pattern p = Pattern.compile("[0-9]{2}\s[0-9]{10}");
		Matcher m = p.matcher(q);
		return (m.find() && m.group().equals(q));
	}

	public static void main(String[] args) {
		System.out.println("Enter first name ");
		Scanner sc = new Scanner(System.in);
		String f = sc.nextLine();
		if (name(f))
			System.out.println("first name is valid");

		else

			System.out.println("first name is invalid");

		System.out.println("\nenter last name ");
		String l = sc.nextLine();
		if (name(l))
			System.out.println("last name is valid");

		else
			System.out.println("last name is invalid");

		System.out.println("\nenter email ");
		String e = sc.nextLine();
		if (email(e))
			System.out.println("email is valid");

		else
			System.out.println("email is invalid");

		System.out.println("\nenter phone number ");
		
		String pn = sc.nextLine();
		if (phonenumber(pn))
			System.out.println("phone number is valid");

		else
			System.out.println("phone number is invalid");
	}
}
