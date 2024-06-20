package collection2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {
	int id;
	String name;
	double salary;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {

		return this.name.compareTo(o.name);
		// return (int) (this.salary-o.salary);
	}
}

public class ComparableEx {

	public static void main(String[] args) {
		ArrayList<Employee> arrayList = new ArrayList<>();
		arrayList.add(new Employee(1, "Meher", 10000));
		arrayList.add(new Employee(2, "Ketki", 30000));
		arrayList.add(new Employee(3, "Siya", 50000));
		arrayList.add(new Employee(4, "Priya", 40000));
		System.out.println("List is : " + arrayList);
		Collections.sort(arrayList);
		System.out.println("Sort by salary : ");
		for (Employee s : arrayList) {
			System.out.println(s);
		}

	}

}
