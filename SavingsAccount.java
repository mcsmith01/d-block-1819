public class SavingsAccount extends BankAccount implements InterestBearing {

  private double interestRate;
  private String word;

  public SavingsAccount(int n, String pass, Bank b, double r){
    super(n, pass, b);
    interestRate = r;
    word = pass;
  }

  public double accrueInterest(int months){
    double rate = interestRate/12;
    rate *= months * getBalance(word);
    deposit(rate);
    return getBalance(word);
  }

  @Override
  public String toString(){
    String result = "SavingsAccount \n";
    result += super.toString();
    result += "\n" + interestRate;
    return result;
  }
}
