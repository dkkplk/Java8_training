package com.learning.java8.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StudentMarksDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Student, String> grades = s -> {
			String output = "";
			switch (s.marks) {

			case 65:
				output = "First Division";
				break;
			case 50:
				output = "Second division";
				break;
			default:
				output = "Fail";

			}
			return output;
		};

		Student s1 = new Student("Dhanesh", 65);
		Student s2 = new Student("ganesh", 50);
		Student s3 = new Student("Ramesh", 40);

		List<Student> students = new ArrayList<Student>();

		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		for(Student s: students)
		{
			System.out.println("Students Details are : ");
			System.out.println(s.name+" "+ s.marks+" "+ grades.apply(s));
		}
	}

}
