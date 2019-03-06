import java.util.ArrayList;

public class Hanoi {

  private static ArrayList<Integer> one;
  private static ArrayList<Integer> two;
  private static ArrayList<Integer> three;

  public static void main(String[] args){
    one = new ArrayList<Integer>();
    two = new ArrayList<Integer>();
    three = new ArrayList<Integer>();
    for (int i = 0; i < 5; i++){
      one.add(i + 1);
    }
    int count = moveTower(one.size(), two, one, three);
    System.out.println(count);
  }

  public static int moveTower(int rings, ArrayList<Integer> to, ArrayList<Integer> from, ArrayList<Integer> aux){
    if (rings == 1){
      int i = from.remove(0);
      to.add(0, i);
      System.out.println("moved " + i + " from " + getTower(from) + " to " + getTower(to));
      return 1;
    }
    int count = moveTower(rings - 1, aux, from, to);
    count += moveTower(1, to, from, aux);
    count += moveTower(rings - 1, to, aux, from);
    return count;
  }

  private static String getTower(ArrayList<Integer> tower) {
    if (tower.equals(one)) {
      return "one";
    } else if (tower.equals(two)) {
      return "two";
    } else {
      return "three";
    }
  }
}
