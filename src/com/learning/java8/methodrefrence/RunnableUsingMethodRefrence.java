package com.learning.java8.methodrefrence;

public class RunnableUsingMethodRefrence {

	public static void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r = RunnableUsingMethodRefrence::m1;
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Parent Thread");
		}

	}

}
