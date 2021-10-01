package com.learning.java8.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateStringDemo {

	public static void main(String[] args) {

		String[] names = { "Katrina", "Madhuri", "Alia", "Kirti", "Karishma" };

		Predicate<String> startWithKNames = s -> s.charAt(0) == 'K';

		for (String s : names) {
			if (startWithKNames.test(s)) {
				System.out.println(s);
			}
		}

		String[] users = { "Test", null, "", "User", "", null };

		Predicate<String> notNullAndEmpty = s -> s != null && !s.isEmpty();

		List<String> usersList = new ArrayList<>();

		for (String s : users) {
			if (notNullAndEmpty.test(s)) {
				usersList.add(s);
			}
		}

		System.out.println(usersList);
	}

}
