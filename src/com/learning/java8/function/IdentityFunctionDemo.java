package com.learning.java8.function;

import java.util.function.Function;

public class IdentityFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String,String> f = Function.identity();
		
		System.out.println(f.apply("Test"));

	}

}
