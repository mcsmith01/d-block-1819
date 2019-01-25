public class BankRunner {

	public static void main(String[] args) {
		Bank chaseBank = new Bank("Chase Bank", 10000000, 0.025);
		int savings = chaseBank.createSavingsAccount("werdp@ss");
		double bal = chaseBank.deposit(savings, 12.00, "werdp@ss");
		System.out.println(bal);
		System.out.println(chaseBank.acctInfo(savings, "werdp@ss"));
		System.out.println(chaseBank.acctInfo(savings, "werdp@s"));

	}

}
