package com.learning.java8.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserPredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<User> validUser = u -> u.getName().equals("Dharmendra") && u.getPassword().equals("123");

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter username");
		String username = sc.next();

		System.out.println("Please enter password");
		String password = sc.next();

		User u = new User(username, password);

		if (validUser.test(u))
			System.out.println("User is valid");
		else
			System.out.println("User is invalid");
		sc.close();
	}

}
