import java.util.ArrayList;

public class Unit5 {

  public static void main(String[] args) {
    System.out.println(isPalindrome("racecar"));
    System.out.println(isPalindrome("palindrome"));
    System.out.println(isPalindrome("dogeeseseegod"));
    collatzSequence(13);
    System.out.println();
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for (int i = 0; i <= 11; i++){
      arr.add(i + 1);
    }
    System.out.println(sum(arr));

  }
  public static boolean isPalindrome(String palindrome){
    return isPalindrome(palindrome, 0, palindrome.length() - 1);


  //   if (palindrome.length() < 2){
  //     return true;
  //   }
  //   String first = palindrome.substring(0,1);
  //   String last = palindrome.substring(palindrome.length() - 1);
  //   if (first.equals(last)){
  //     return isPalindrome(palindrome.substring(1, palindrome.length() - 1));
  //   }
  //   else {
  //     return false;
  //   }
  }

  public static boolean isPalindrome(String palindrome, int first, int last){
    if (first >= last) {
      return true;
    }
    if (palindrome.substring(first, first + 1).equals(palindrome.substring(last, last + 1))) {
      return isPalindrome(palindrome, first + 1, last - 1);
    } else {
      return false;
    }
  }

  public static int triangleNumbers(int t){
    if (t == 1){
      return t;
    }
    return t + triangleNumbers(t-1);
  }
  public static void collatzSequence(int n){
    System.out.print(n + " ");
    if (n == 1){
      return;
    }
    if (n % 2 == 0){
      collatzSequence(n/2);
    }
    else {
      collatzSequence(3*n+1);
    }

  }

  public static int sum(ArrayList<Integer> arr){
    return sum(arr, 0);
  }

  public static int sum(ArrayList<Integer> arr, int index){
    if(index == arr.size()){
      return 0;
    } else {
      return arr.get(index) + sum(arr, index + 1);
    }
  }

}
