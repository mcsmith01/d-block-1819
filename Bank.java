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

	public int createSavingsAccount(String pass) {
		int num = accounts.size();
		BankAccount account = new SavingsAccount(num, pass, this, loanRate - 0.02);
		accounts.add(account);
		return num;
	}

	public int createCheckingAccount(String pass, int runoff, String runoffPassword) {
		int num = accounts.size();
		BankAccount ba = accounts.get(runoff);
		BankAccount account = new CheckingAccount(num, pass, this, ba, runoffPassword);
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

	public String getName() {
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

	public void runInterest(int months) {
		for (BankAccount b : accounts) {
			if (b instanceof InterestBearing) {
				((InterestBearing) b).accrueInterest(months);
			}
		}
	}
}
