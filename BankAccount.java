public class BankAccount {

	private double balance;
	private double interestRate;
	private String password;

	public BankAccount(double rate, String pass) {
		balance = 0;
		interestRate = rate;
		password = pass;
	}

	public double getBalance(String p) {
		if (p.equals(password)) {
			return balance;
		} else {
			return -1;
		}
	}

}
