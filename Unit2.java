public class Unit2 {

	public static void main(String[] args) {
		// strings();
		wolfpack();
		// fundamentals();
	}

	public static void fundamentals() {
		int x = 7;
		int y = 2;
		double z = (double) x / y * y;
		System.out.println(z);
	}
	public static void wolfpack(){
		String mclaughinmyrarri = "It's a great day to do stats; we need more people in stats! stats is fantastic";
		// mclaughinmyrarri = "zzzzzzzzzzzzzzzzzzzzzzzzzz";
		String zinteger = "zzzzzz";
		int z = -(zinteger.length());
		do {
			z = mclaughinmyrarri.indexOf(zinteger, z + zinteger.length());
			System.out.println(z);
		} while (z > -1);
		String andSwitch = mclaughinmyrarri.substring(23, 28); // 28-23=5 QEDont@me
		System.out.println(andSwitch);
		System.out.println("abc".compareTo("cde"));
// lorenzo's code


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
