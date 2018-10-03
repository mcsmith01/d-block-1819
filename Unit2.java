public class Unit2 {

	public static void main(String[] args) {
		strings();
		// fundamentals();
	}

	public static void fundamentals() {
		int x = 7;
		int y = 2;
		double z = (double) x / y * y;
		System.out.println(z);
	}

	public static void strings() {
		String s = "Hello";
		String t = "World";
		System.out.println(s + " " + t);
		System.out.println(s + 7);
		System.out.println(5 + 7.0);
		System.out.println("5" + 7.0 + 3);
		System.out.println(7.0 + 3 + t);
		double d = Double.valueOf("73.0");
		System.out.println(d + 4);
		// d = Double.valueOf(s);
		System.out.println(d);
		System.out.println(s.length());
		s = s.toUpperCase();
		System.out.println(s);
	}

}
