public class SavingsAccount extends BankAccount{

  private double interestRate;
  private String word;

  public SavingsAccount(int n, String pass, Bank b, double r){
    super(n, pass, b);
    interestRate = r;
    word = pass;
  }

  public double acrooInterest(int months){
    double rate = interestRate/12;
    rate *= months * getBalance(word);
    deposit(rate);
    return getBalance(word);
  }

  @Override
  public String toString(){
    String result = "SavingsAccount \n";
    result += super.toString();
    result += interestRate;
    return result;
  }
}
