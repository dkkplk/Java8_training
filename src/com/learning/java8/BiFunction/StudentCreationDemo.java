package com.learning.java8.BiFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class StudentCreationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BiFunction<String, Integer, Student> create = (name,rollnum) -> new Student(name, rollnum);
		
		List<Student> students = new ArrayList<>();
		
		students.add(create.apply("Raju", 10));
		students.add(create.apply("Ritu", 20));
		
		System.out.println(students);
	}

}
