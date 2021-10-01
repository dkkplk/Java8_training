package com.learning.java8.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerChainingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Movie> movies = new ArrayList<Movie>();
		populate(movies);

		Consumer<Movie> c1 = m -> System.out.println(m.name);
		Consumer<Movie> c2 = m -> System.out.println(m.heroName);
		Consumer<Movie> c3 = m -> System.out.println(m.heroinName);

		for (Movie movie : movies) {
			c3.andThen(c2).andThen(c1).accept(movie);
		}

	}

	private static void populate(List<Movie> movies) {
		// TODO Auto-generated method stub

		movies.add(new Movie("test", "test2", "test3"));
		movies.add(new Movie("test", "test2", "test3"));
		movies.add(new Movie("test", "test2", "test3"));
		movies.add(new Movie("test", "test2", "test3"));
		movies.add(new Movie("test", "test2", "test3"));
		movies.add(new Movie("test", "test2", "test3"));
	}

}
