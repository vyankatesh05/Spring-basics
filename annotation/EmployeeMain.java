package core.spring.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("core/spring/annotation/config.xml");
		
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);
		context.registerShutdownHook();
	}

}
