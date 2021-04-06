package patterns;

import java.util.*;
import java.util.regex.*;

public class Regex {
	public static boolean firstname(String s) {

		Pattern p = Pattern.compile("[A-Z]{1}[a-z]{3,}");
		Matcher m = p.matcher(s);
		return (m.find() && m.group().equals(s));
	}


	public static void main(String[] args) {
		System.out.println("Enter first name ");
		Scanner sc = new Scanner(System.in);
		String f = sc.nextLine();
		if (firstname(f))
			System.out.println("first name is valid");

		else
			System.out.println("first name is invalid");
}