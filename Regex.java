package patterns;

import java.util.*;
import java.util.regex.*;

public class Regex {
	public static boolean name(String t) {

		Pattern p = Pattern.compile("[A-Z]{1}[a-z]{2,}");
		Matcher m = p.matcher(t);
		return (m.find() && m.group().equals(t));
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

	}
}
