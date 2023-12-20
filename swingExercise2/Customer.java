package core.spring.swingExercise2;

import java.util.List;

public class Customer {
	private String name;
	private List <String> address;
	private List <Account> accounts;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getaddress() {
		return address;
	}
	public void setaddress(List<String> address) {
		this.address = address;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", cities=" + address + ", accounts=" + accounts + "]";
	}
	
	
	

}
