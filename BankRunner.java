public class BankRunner {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount(0.03, "password");
		System.out.println(ba.getBalance("password"));
		System.out.println(ba.getBalance("Password"));
		ba.deposit(100);
		System.out.println(ba.getBalance("password"));
		ba.deposit(-500);
		System.out.println(ba.getBalance("password"));
		ba.withdraw(20, "password");
		System.out.println(ba.getBalance("password"));
		System.out.println(ba.accrueInterest(2));

	}

}
