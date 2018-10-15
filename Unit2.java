public class Unit2 {

	public static void main(String[] args) {
		// strings();
		// wolfpack();
		// fundamentals();
		ifStatements();
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
// lorenzo's trash code
}

public static void ifStatements() {
	int random1 = (int) (Math.random() * 10);
	int random2 = (int) (Math.random() * 10);
	int random3 = (int) (Math.random() * 10);
	random1 = 4;
	random2 = 4;
	random3 = 5;

	if (random1 <= random2 && random1 <= random3) {
		System.out.print(random1 + " ");
		if (random2 < random3) {
			System.out.println(random2 + " " + random3);
		} else {
			System.out.println(random3 + " " + random2);
		}
	}
	else if (random2 <= random1 && random2 <= random3) {
		System.out.print(random2 + " ");
		if (random1 < random3) {
			System.out.println(random1 + " " + random3);
		} else {
				System.out.println(random3 + " " + random1);
			}
		} else {
			System.out.print(random3 + " ");
			if (random1 < random2) {
				System.out.println(random1 + " " + random2);
			} else {
				System.out.println(random2 + " " + random1);
			}
		}
		String strang = "I am strange";
		String strong = "I am not Marcus";
		if (strang.equals(strong)) {
 			System.out.println("True");
		}
		if (strang.compareTo(strong) < 0) {
			System.out.println("strang comes first");
		} else {
			System.out.println("strong comes first");
		}
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
