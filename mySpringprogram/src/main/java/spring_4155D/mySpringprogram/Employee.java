4package spring_4155D.mySpringprogram;

public class Employee {
	int empId;
	String name;
	String designation;
	double salary;
	
	
	
	
	public Employee(int empId, String name, String designation, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}




	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ "]";
	}
	
	

}
