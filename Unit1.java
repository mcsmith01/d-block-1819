import java.awt.Rectangle;

public class Unit1 {

  public static void main(String[] args) {
    variables();
  }

  public static void variables() {
    int y = 11;
    int x = 5;
    x = 7;
    double xx;
    xx = 4.2;
    y = x;
    x = 3;
    System.out.println(x);
    System.out.println(y);
    System.out.println(xx);

    Rectangle wrect;
    wrect = new Rectangle(x, y, (int) xx, x * y);
    System.out.println(wrect);
  }

}
