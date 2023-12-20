package core.spring.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
	private int empno;
	private String empname;
	private int salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empname=" + empname + ", salary=" + salary + "]";
	}
	
	@PostConstruct
	private void start() {
		System.out.println("Initilizing bean");
	}
	
	@PreDestroy
	private void end() {
		System.out.println("Bean object is about to end");

	}
}
