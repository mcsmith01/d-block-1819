public class Unit3 {

  public static void main(String[] args) {
    int x = sumOfMinutesChenzoIsLate(90);
    System.out.println(x);
    timesDevProvesHesGreat("everyday");
    int y = exponents(3, 5);
    System.out.println(y);
  }
  public static int sumOfMinutesChenzoIsLate(int num) {
    int initialSum = 0;
    int minutesLate = 1;
    while(minutesLate <= num) {
      initialSum += minutesLate;
      minutesLate++;

    }
    return initialSum;

  }
  public static void timesDevProvesHesGreat(String allTheTime) {
    int end = allTheTime.length();
    while(0 != end){
      String endingPoint = allTheTime.substring(end - 1, end);
      System.out.println(endingPoint);
      end--;
    }
  }
  public static int exponents(int base, int pow) {
    int currentResult = 1;
    int iteration = 0;
    while(iteration < pow) {
      currentResult = currentResult * base;
      iteration++;
    }
    while(iteration > 0) {
      System.out.println("class is over");
    }
    return currentResult;

  }


}
