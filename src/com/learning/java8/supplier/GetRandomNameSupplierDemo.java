package com.learning.java8.supplier;

import java.util.function.Supplier;

public class GetRandomNameSupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<String> s = () -> {

			String[] names = { "Sunny", "Bunny", "Honey", "Lucky" };
			int x = (int) (Math.random() * names.length);

			return names[x];
		};

		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());

	}

}
