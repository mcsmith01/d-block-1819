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
		BankAccount account = new BankAccount(num, loanRate - 0.02, pass, this);
		accounts.add(account);
		return num;
	}

	public double deposit(int num, double amount, String pass) {
		BankAccount ba = accounts.get(num);
		if (ba.deposit(amount) >= 0) {
			vault += amount;
		}
		return ba.getBalance(pass);
	}

	public boolean withdraw(int num, double amount, String pass) {
		BankAccount ba = accounts.get(num);
		if (vault >= amount && ba.withdraw(amount, pass) != -1) {
			vault -= amount;
			return true;
		} else {
			return false;
		}
	}

	public double getBalance(int num, String pass) {
		BankAccount ba = accounts.get(num);
		return ba.getBalance(pass);
	}
	public String getName(){
		return name;
	}
	public String acctInfo(int num, String pass){
		BankAccount ba = accounts.get(num);
		if (ba.checkPassword(pass)){
			return ba.toString();
		} else {
			return "YOU SHALL NOT PASS!";
		}

	}
}
