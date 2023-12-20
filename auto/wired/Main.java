package core.spring.auto.wired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("core/spring/auto/wired/config.xml");
		Employee emp = context.getBean("emp",Employee.class);
		System.out.println(emp);
	}

}
