public class BankAccount {

	private int acctNumber;
	private double balance;
	private double interestRate;
	private String password;
	private Bank bank;

	public BankAccount(int n, double rate, String pass, Bank b) {
		acctNumber = n;
		balance = 0;
		interestRate = rate;
		password = pass;
		bank = b;
	}

	public double getBalance(String p) {
		if (p.equals(password)) {
			return balance;
		} else {
			return -1;
		}
	}

	public double deposit(double amount) {
		if (amount <= 0) {
			return -1;
		}
		balance = balance + amount;
		return balance;
	}

	public double withdraw(double amount, String pass) {
		if (amount >= 0 && pass.equals(password) && amount <= balance) {
			balance -= amount;
			return balance;
		} else {
			return -1;
		}
	}

	public double accrueInterest(int month) {
		double monthRate = interestRate/12 * month; /*interest*/
		double interest = balance * monthRate; /*balance with interest*/
		balance = balance + interest; /*balance plus interest made*/
		return balance;
	}

	public String toString() {
		


	}

}
