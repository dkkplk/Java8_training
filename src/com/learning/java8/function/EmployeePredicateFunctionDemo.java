package com.learning.java8.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeePredicateFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employees = new ArrayList<>();
		populate(employees);
		System.out.println(employees);

		// requirement is to increment the salary of
		// employees having salary less than 4000
		// and increase there salary with 500

		Predicate<Employee> lessSalary = e -> e.salary < 4000;
		Function<Employee, Employee> incSalary = e -> {
			e.salary = e.salary + 500;
			return e;
		};
		List<Employee> incEmployee = new ArrayList<Employee>();

		for (Employee employee : employees) {

			if (lessSalary.test(employee)) {
				incSalary.apply(employee);
				incEmployee.add(employee);
			}
		}

		System.out.println(employees);

		System.out.println("Salary incremented employee");
		System.out.println(incEmployee);

	}

	private static void populate(List<Employee> employees) {
		// TODO Auto-generated method stub

		employees.add(new Employee("Sunny", 1000));
		employees.add(new Employee("Bunny", 2000));
		employees.add(new Employee("Hunny", 4000));
		employees.add(new Employee("Gunny", 5000));
		employees.add(new Employee("Lunny", 3000));
		employees.add(new Employee("Cunny", 8000));

	}

}
