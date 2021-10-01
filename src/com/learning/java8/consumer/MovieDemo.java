package com.learning.java8.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MovieDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Movie> movies = new ArrayList<Movie>();
		populate(movies);
		
		Consumer<Movie> c = m -> {

			System.out.println(m.name + " " + m.heroName + " " + m.heroinName);
		};

		for (Movie movie : movies) {
			c.accept(movie);
		}

	}

	private static void populate(List<Movie> movies) {
		// TODO Auto-generated method stub

		movies.add(new Movie("test", "test2", "test3"));
		movies.add(new Movie("test1", "test2", "test3"));
		movies.add(new Movie("tes2", "test2", "test3"));
		movies.add(new Movie("test3", "test2", "test3"));
		movies.add(new Movie("tes4", "test2", "test3"));
		movies.add(new Movie("test5", "test2", "test3"));
	}

}
