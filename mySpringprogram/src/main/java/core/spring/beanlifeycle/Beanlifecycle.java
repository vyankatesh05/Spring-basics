package core.spring.beanlifeycle;

public class Beanlifecycle {
	private String name;
	private String message;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("Assigning name");
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
		System.out.println("Assigning essage");
	}
	public Beanlifecycle() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public void init() {
		System.out.println("bean init() method");
	}
	
	public void destroy() {
		System.out.println("bean destroy method");
	}
}
