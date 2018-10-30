public class Unit3 {

  public static void main(String[] args) {
    devIsSmall(22); devIsSwole(22);
    // int x = sumOfMinutesChenzoIsLate(90);
    // System.out.println(x);
    // timesDevProvesHesGreat("everyday");
    // int y = exponents(3, 5);
    // System.out.println(y);
  }
  public static int sumOfMinutesChenzoIsLate(int num) {
    int initialSum = 0;
    //int minutesLate = 1;
    // while(minutesLate <= num) {
    //   initialSum += minutesLate;
    //   minutesLate++;
    //
    // }
    for (int minutesLate = 1; minutesLate <= num; minutesLate++){
      initialSum += minutesLate;
    }
    return initialSum;

  }
  public static void devIsSmall(int num1){ for (int i = 0; i <= num1; i++){ System.out.println(i);} }

  public static void devIsSwole(int evens){ for (int i = 0; i <= evens; i++){ if (i % 2 == 0){ System.out.print(i+" "); } } System.out.println(); for (int i = 0; i <= evens; i+=2){ System.out.print(i + " "); } }


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
    // while(iteration > 0) {
    //   System.out.println("class is over");
    // }
    return currentResult;

  }


}
