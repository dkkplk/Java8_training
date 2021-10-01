package com.learning.java8.methodrefrence;

interface Interf {
	public void m1();
}

public class MethodInterfaceDemo {

	public static void m2() {
		System.out.println("M2 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interf i = MethodInterfaceDemo::m2;

		i.m1();
	}

}
