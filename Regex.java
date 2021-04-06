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
	}
}
