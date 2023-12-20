package core.spring.auto.wired.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	//m1 to declare annotation @Autowired is on property (Similar to byType autowiring)
	@Autowired
	@Qualifier("address123")
	private Address address;

	public Address getAddress() {
		return address;
	}

	//m2 to declare annotation @Autowired is on Setter method 
   //@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setting values");
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	//m3 to declare annotation @Autowired is on constructor (bean name can be different)
	//@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside constructor");
	}

	@Override
	public String toString() {
		return "Employee [Address=" + address+" ]";
	}
	
}
