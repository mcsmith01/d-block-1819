import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Sorting {

	public static void main(String[] args) {
		String[] algorithms = {};
	}

	public static long testSort(String sort, int[] arr) {
		int[] tester = clone(arr);
		try {
			Class<?> c = Class.forName("Sorting");
			Method m = c.getDeclaredMethod(sort, arr.getClass());
			long time = System.nanoTime();
			m.invoke(null, tester);
			time = System.nanoTime() - time;
			if (!isSorted(tester)) {
				System.out.println("Not sorted!");
			}
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

}
