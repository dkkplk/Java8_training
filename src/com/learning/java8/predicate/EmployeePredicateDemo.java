package com.learning.java8.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeePredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> list = new ArrayList<>();
		populate(list);
		
		Predicate<Employee> isManager = e -> e.designation.equals("Manager");
		
		display(isManager,list);
		
		System.out.println("Bangalore city employee ");
		Predicate<Employee> isCity = e -> e.city.equals("Bangalore");

		display(isCity, list);
	}

	private static void display(Predicate<Employee> isManager, List<Employee> list) {
		
		for(Employee e : list)
		{
			if(isManager.test(e))
			{
				System.out.println(e);
			}
		}
		
	}

	public static void populate(List<Employee> list) {
		list.add(new Employee("Durga", "CEO", 30000, "Hyderabad"));
		list.add(new Employee("Sunny", "Manager", 20000, "Hyderabad"));
		list.add(new Employee("Mallika", "Manager", 20000, "Bangalore"));
		list.add(new Employee("Kareena", "Lead", 15000, "Hyderabad"));
		list.add(new Employee("Katrina", "Lead", 15000, "Bangalore"));
		list.add(new Employee("Anushka", "Developer", 10000, "Hyderabad"));
		list.add(new Employee("Kanushka", "Developer", 10000, "Hyderabad"));
		list.add(new Employee("Sowmya", "Developer", 10000, "Bangalore"));
		list.add(new Employee("Ramya", "Developer", 10000, "Bangalore"));
	}
}
