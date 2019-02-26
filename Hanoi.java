import java.util.ArrayList;

public class Hanoi {

  public static void main(String[] args){
    ArrayList<Integer> one = new ArrayList<Integer>();
    ArrayList<Integer> two = new ArrayList<Integer>();
    ArrayList<Integer> three = new ArrayList<Integer>();
    for (int i = 0; i < 3; i++){
      one.add(i);
    }
    int count = moveTower(one.size(), two, one, three);
    System.out.println(count);
  }

  public static int moveTower(int rings, ArrayList<Integer> to, ArrayList<Integer> from, ArrayList<Integer> aux){
    if (rings == 1){
      int i = from.remove(0);
      to.add(0, i);
      System.out.println("moved " + i + " from " + from + " to " + to);
      return 1;
    }
    int count = moveTower(rings - 1, aux, from, to);
    count += moveTower(1, to, from, aux);
    count += moveTower(rings - 1, to, aux, from);
    return count;
  }
}
