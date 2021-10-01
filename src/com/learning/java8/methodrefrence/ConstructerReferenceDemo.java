package com.learning.java8.methodrefrence;

class Sample {
	Sample() {
		System.out.println("Sample class Constructer");
	}
}

interface Interfa {
	public Sample m1();
}

public class ConstructerReferenceDemo {

	public static void main(String[] args) {

		Interfa i = Sample::new;
		Sample s = i.m1();

	}

}
