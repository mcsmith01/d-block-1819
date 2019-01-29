
public class CheckingAccount extends BankAccount {

private BankAccount runoff;
private String runoffPassword;

public CheckingAccount(int n, String pass, Bank b, BankAccount runoff, String runoffPassword) {
  super(n, pass, b);
  this.runoff = runoff;
  this.runoffPassword = runoffPassword;

}
  @Override
  public double withdraw(double amount, String pass) {
    if (getBalance(pass) < amount) {
      double diff = amount - getBalance(pass);
      if (runoff.withdraw(diff, runoffPassword) == -1) {
        return -1;
      } else {
        deposit(diff);
        return super.withdraw(amount, pass);
      }
    } else {
      return super.withdraw(amount, pass);
    }

  }
}
