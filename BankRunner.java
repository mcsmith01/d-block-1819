public class BankRunner {

	public static void main(String[] args) {
		Bank chaseBank = new Bank("Chase Bank", 10000000, 0.025);
		int savings = chaseBank.createSavingsAccount("werdp@ss");
		double bal = chaseBank.deposit(savings, 12.00, "werdp@ss");
		int checking = chaseBank.createCheckingAccount("012345", savings, "werdp@ss");
		chaseBank.deposit(checking, 12.50, "012345");
		chaseBank.withdraw(checking, 20.00, "012345");
		System.out.println("Communism was never put in practice correctly");
		System.out.println(chaseBank.acctInfo(checking, "012345"));
		System.out.println(chaseBank.acctInfo(savings, "werdp@ss"));

	}

}
