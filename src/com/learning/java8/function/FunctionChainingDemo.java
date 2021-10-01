package com.learning.java8.function;

import java.util.function.Function;

public class FunctionChainingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String, String> upperCase = s -> s.toUpperCase();
		Function<String, String> subString = s -> s.substring(0, 10);

		System.out.println(upperCase.apply("DharmendraKumar"));
		System.out.println(subString.apply("DharmendraKumar"));
		System.out.println(upperCase.andThen(subString).apply("DharmendraKumar"));
		System.out.println(upperCase.compose(subString).apply("DharmendraKumar"));
		
		Function<Integer,Integer> f1 = i -> i+i;
		Function<Integer, Integer> f2 = i -> i*i*i;
		
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(2));
	}

}
