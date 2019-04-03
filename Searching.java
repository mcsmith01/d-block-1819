import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Searching {

public static void main(String[] args) {
  ArrayList<String> ignore = new ArrayList<String>();
  String[] algorithms = {"linear", "binary"};
  System.out.print("Size      ");
  for (String a : algorithms) {
    System.out.printf("%15s", a);
  }
  System.out.println();
  for(int num = 1; num < 1000000000; num = num * 2){
    System.out.printf("%-10d", num);
    int[] randomArray = randomArr(num);
    int index = (int) (Math.random() * num);
    int target = randomArray[index];
    target = -1;
    for(String a : algorithms){
      if (!ignore.contains(a)) {
        double time = testSearch(a,randomArray, target) / 1000000.0;
        System.out.printf("%,15.3f", time);
        if (time > 15000) {
          ignore.add(a);
        }
      } else {
        System.out.printf("%15s", "---");
      }
    }
    System.out.println();
  }
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

  public static long testSearch(String sort, int[] arr, int target) {
		// Create a copy of the array
		try {
			// Get the desired method from this class
			Class<?> c = Class.forName("Searching");
			Method m = c.getDeclaredMethod(sort, arr.getClass(), int.class);
			// Start the timer
			long time = System.nanoTime();
			// Run the sort algorithm

			m.invoke(null, arr, target);
			// Calculate elapsed time
			time = System.nanoTime() - time;
			return time;
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (NoSuchMethodException nsme) {
			nsme.printStackTrace();
		} catch (IllegalAccessException iae) {
			iae.printStackTrace();
		} catch (InvocationTargetException ite) {
			ite.printStackTrace();
		}
		return -1;
	}

  public static int[] randomArr(int num){
    int delta = 5;
		int[] arr = new int[num];
    arr[0] = (int) (Math.random() * delta);
		for(int i = 1; i < num;i++){
			arr[i] = arr[i - 1] + (int)(Math.random() * delta);
		}
		return arr;
	}

}
