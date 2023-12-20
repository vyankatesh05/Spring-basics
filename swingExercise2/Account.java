package core.spring.swingExercise2;

import java.util.List;

public class Account {
	private List<Integer> accountNumbers;
    private List<Double> balances;
	public List<Integer> getAccountNumbers() {
		return accountNumbers;
	}
	public void setAccountNumbers(List<Integer> accountNumbers) {
		this.accountNumbers = accountNumbers;
	}
	public List<Double> getBalances() {
		return balances;
	}
	public void setBalances(List<Double> balances) {
		this.balances = balances;
	}
	@Override
	public String toString() {
		return "Account [accountNumbers=" + accountNumbers + ", balances=" + balances + "]";
	}
    
    
}
