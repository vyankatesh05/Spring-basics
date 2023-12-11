package spring_4155D.mySpringprogram;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Bean-1 Student, getting value using property tag");

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Student st = (Student) context.getBean("student");
		System.out.println(st);
		
		System.out.println();
		System.out.println("Bean-2 Student, getting value using constructor");
		Student1 st1 = (Student1) context.getBean("student1");
		System.out.println(st1);
		
		System.out.println();
		System.out.println("Bean-3 Employee, getting value using constructor");
		Employee e1 = (Employee) context.getBean("employee");
		System.out.println(e1);
		
//		ArrayList<Integer> al = new ArrayList<>();
//		al.add(2);
//		al.add(12);
//		al.add(22);
//		System.out.println(al);
	}
}
