package com.learning.java8.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class EmployeeFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employees = new ArrayList<Employee>();
		populate(employees);

		System.out.println(employees);

		Function<List<Employee>, Double> total = l -> {
			double totalSalary = 0;
			for (Employee e : l) {
				totalSalary = totalSalary + e.salary;
			}

			return totalSalary;
		};
		
		System.out.println(total.apply(employees));

	}

	private static void populate(List<Employee> employees) {
		// TODO Auto-generated method stub

		employees.add(new Employee("Sunny", 10000));
		employees.add(new Employee("Bunny", 20000));
		employees.add(new Employee("Honey", 40000));
		employees.add(new Employee("Gunny", 30000));
		employees.add(new Employee("Munny", 50000));
		employees.add(new Employee("Lunny", 70000));

	}

}
