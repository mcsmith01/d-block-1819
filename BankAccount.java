public class BankAccount {

	private int acctNumber;
	private double balance;
	private String password;
	private Bank bank;

	public BankAccount(int n, String pass, Bank b) {
		acctNumber = n;
		balance = 0;
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

	public boolean checkPassword(String guess) {
		return guess.equals(password);
	}

	@Override
	public String toString() {
		String result = bank.getName();
		result = result + "\n" + acctNumber;
		result += "\n" + balance;
		//result += "\n" + interestRate;
		return result;
	}

}
