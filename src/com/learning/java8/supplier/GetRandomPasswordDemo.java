package com.learning.java8.supplier;

import java.util.function.Supplier;

public class GetRandomPasswordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<String> s = () -> {
			String pwd = "";

			Supplier<Integer> getDigit = () -> {
				return (int) (Math.random() * 10);
			};

			String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";

			Supplier<Character> getChar = () -> {

				return chars.charAt((int) (Math.random() * chars.length()));
			};

			for (int i = 0; i < 8; i++) {
				if (i % 2 == 0) {
					pwd = pwd + getDigit.get();
				} else {
					pwd = pwd + getChar.get();
				}
			}
			return pwd;
		};
		
		System.out.println(s.get());
		System.out.println(s.get());

	}

}
