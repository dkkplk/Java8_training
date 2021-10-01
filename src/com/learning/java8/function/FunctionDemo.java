package com.learning.java8.function;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer,Integer> squre = i -> i*i;
		
		System.out.println(squre.apply(3));
		
		String input = "I Am The Best";
		Function<String,String> removeSpace = s -> s.replace(" ","");

		System.out.println(removeSpace.apply(input));

		
		Function<String, Integer> spaceCount  = s -> s.length() - s.replace(" ", "").length();
		
		System.out.println(spaceCount.apply(input));
	}

}
