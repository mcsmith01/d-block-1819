public class Unit3 {

  public static void main(String[] args) {
    // int x = gcd (100, 856);
    // System.out.println(x);
    //factors (100);
    //fib(30);
    int x = fibNum(60);
    System.out.println(x);
	nested();
    // devIsSmall(22); devIsSwole(22);
    // int x = sumOfMinutesChenzoIsLate(90);
    // System.out.println(x);
    // timesDevProvesHesGreat("everyday");
    // int y = exponents(3, 5);
    // System.out.println(y);
  }

	public static void nested() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(i + j);
			}
		}
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

  public static int gcd(int num1, int num2) {
    while (num1 != num2) {
      System.out.println(num1 + " " + num2);
      if (num1 > num2) {
        num1 = num1 - num2;
      } else {
        num2 = num2 - num1;
      }
    }
    return num1;
  }
  public static void fib(int x){
    int num1 = 1;
    int num2 = 1;
    System.out.println(num1);
    System.out.println(num2);
    for(int i = 2; i < x; i++){
      int sum = num1 + num2;
      num1 = num2;
      num2 = sum;
      System.out.println(sum);
    }
  }
  public static int fibNum(int x){
    int num1 = 1;
    int num2 = 1;
    while(num2 < x){
      int sum = num1 + num2;
      num1 = num2;
      num2 = sum;
    }
    return num1;
  }
  public static void factors(int num) {
    int divisor = 2;
    int exponent = 0;
    while (divisor <= num) {
      if (num % divisor == 0) {
        exponent++;
        num /= divisor;
        if (num == 1) {
          System.out.print(divisor + "^" + exponent + " ");
        }
      } else {
        if (exponent > 0) {
          System.out.print(divisor + "^" + exponent + " ");
        }
        divisor++;
        exponent = 0;
      }
    }
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
    // while(iteration > 0) {
    //   System.out.println("class is over");
    // }
    return currentResult;

  }


}
