package com.learning.java8.BiPredicate;

import java.util.function.BiPredicate;

public class SumIsEvenBiPredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiPredicate<Integer,Integer> isSumEven = (i,j) -> ((i+j) % 2) == 0;
		
		System.out.println(isSumEven.test(10, 6));
		System.out.println(isSumEven.test(3, 6));

	}

}
