package core.spring.collections;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("core/spring/collections/CollectionConfig.xml");
//		EmployeeCollection emp = (EmployeeCollection) context.getBean("emp");
//		System.out.println(emp.getName());
//		System.out.println(emp.getPhoneno());
//		System.out.println(emp.getAddress());

		User user = (User) context.getBean("user");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter userID");
		int uid = sc.nextInt();

		sc.nextLine();

		System.out.println("Enter password");
		String pass = sc.nextLine();

		if (uid == user.getUserID() && pass.equals(user.getPassword())) {
			System.out.println("Login success");
		} else {
			System.out.println("login fail");
		}

	}

}
