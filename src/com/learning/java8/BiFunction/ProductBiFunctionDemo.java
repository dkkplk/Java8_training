package com.learning.java8.BiFunction;

import java.util.function.BiFunction;

public class ProductBiFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiFunction<Integer, Integer, Integer> product = (a,b) -> a*b;
		
		System.out.println(product.apply(10, 50));
	}

}
