import java.util.ArrayList;

public class Bank {

	private double vault;
	private double loanRate;
	private String name;
	private ArrayList<BankAccount> accounts;

	public Bank(String n, double v, double lr) {
		name = n;
		vault = v;
		loanRate = lr;
		accounts = new ArrayList<BankAccount>();
	}

	public int createAccount(String pass) {
		int num = accounts.size();
		BankAccount account = new BankAccount(num, loanRate - 0.02, pass);
		accounts.add(account);
		return num;
	}


}
