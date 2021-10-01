import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee(10, "Dhanesh");
		Employee e2 = new Employee(20, "Kritu");
		Employee e3 = new Employee(40, "Ruchika");
		Employee e4 = new Employee(50, "Govind");
		Employee e5 = new Employee(30, "Deepika");

		List<Employee> employees = new ArrayList<>();

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);

		System.out.println("Employees without sorting "+ employees);
		
		Collections.sort(employees, (o1,o2) -> (o2.getName().compareTo(o1.getName())));

		System.out.println("Employees with sorted data " + employees);
	}

}
