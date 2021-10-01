package com.learning.java8.supplier;

import java.util.function.Supplier;

public class GetRandomOtpSupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<String> s = () -> {
			
			String otp= "";
			for(int i =0 ;i<6;i++)
			{
				otp = otp+ (int)(Math.random()*10);
			}
			return otp;
		};
		
		System.out.println(s.get());
		System.out.println(s.get());

	}

}
