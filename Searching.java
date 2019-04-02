public class Searching {

public static void main(String[] args) {
  int[] thousand = new int[1000];
    for(int i = 0; i < thousand.length; i++) {
      thousand[i] = (int)(Math.random() * thousand.length);
    }
  int exists = thousand[678];
  int birds = thousand.length;

  int helpMe = linear(thousand, exists);
  System.out.println(helpMe);
  int unicorns = linear(thousand, birds);
  System.out.println(unicorns);

  int[] randomSorted = new int[1000];
  randomSorted[0] = (int)(Math.random() * randomSorted.length);
  for(int i = 1; i < randomSorted.length; i++) {
    randomSorted[i] = randomSorted[i - 1] + (int)(Math.random() * 4);
  }

  exists = randomSorted[999];
  birds = exists + 1;

  int run = binary(randomSorted, exists);
  System.out.println(run);
  int thisShouldntWork = binary(randomSorted, birds);
  System.out.println(thisShouldntWork);

}

  public static int linear(int[] arr, int lookingFor) {
    for(int i = 0; i < arr.length; i++) {
      if (arr[i] == lookingFor) {
        return i;
      }
    }
    return -1;
  }

  public static int binary(int[] arr, int lookingFor) {
    int start = 0;
    int end = arr.length;
    do {
      int mid = (start + end) / 2;
      if (arr[mid] == lookingFor) {
        return mid;
      } else if (arr[mid] > lookingFor) {
        end = mid;
      } else {
        start = mid + 1;
      }
    } while (start != end);
    return -1;
  }

}
