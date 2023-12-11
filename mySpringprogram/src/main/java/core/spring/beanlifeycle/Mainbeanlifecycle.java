package core.spring.beanlifeycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainbeanlifecycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("core/spring/beanlifeycle/beanlifecycle.xml");
	//	ApplicationContext ctx = new ClassPathXmlApplicationContext("core/spring/beanlifeycle/beanlifecycle.xml");
		
		Beanlifecycle b=(Beanlifecycle)ctx.getBean("bnlife");
	    System.out.println(b);
	    ctx.registerShutdownHook();
	}

}
