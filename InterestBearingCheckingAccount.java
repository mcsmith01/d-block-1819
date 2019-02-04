public class InterestBearingCheckingAccount extends CheckingAccount implements InterestBearing{
  private double ir;
  private String word;
  public InterestBearingCheckingAccount(int n, String pass, Bank b, BankAccount runoff, String runoffPassword, double interestRate) {
    super(n, pass, b, runoff, runoffPassword);
    ir = interestRate;
    word = pass;
  }
  public double accrueInterest(int months){
    double rate = ir/12;
    rate *= months * getBalance(word);
    deposit(rate);
    return getBalance(word);
  }

}
