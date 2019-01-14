import java.util.ArrayList;

public class Unit4 {

  public static void main(String[] args){
    // int[][] board = generate (10, 10);
    // printBoard(board);
    // double[][] board = randomBoard(10, 10, 20);
    // printBoard(board);
    ArrayList<Integer> list = primeList(10);
    System.out.println(list);
  }

  public static int[][] generate(int r, int c){
    int[][] board = new int[r][c];
    double threshold = 0.9;
    for (int i = 0; i < r; i++){
      for (int j = 0; j < c; j++){
        if (Math.random() > threshold){
          board[i][j] = -1;
        }
      }
    }
    for (int i = 0; i < r; i++){
      for (int j = 0; j < c; j++){
        board[i][j] = countMines(board, i, j);
      }
    }
    return board;
  }
  public static int countMines(int[][] board, int r, int c){
    int x = 0;
    if (board[r][c] == -1){
      return -1;
    }
    for (int i = r - 1; i < r + 2; i++){
      for (int j = c - 1; j < c + 2; j++){
        if (isValid(board, i, j) && board[i][j] == -1){
          x++;
        }
      }
    }
    return x;
  }
  public static boolean isValid(int[][] board, int r, int c){
    if (r < 0 || c < 0){
      return false;
    }
    if (r >= board.length || c >= board[0].length){
      return false;
    }
    return true;
  }
  public static void printBoard(int[][] board){
    for (int[] row : board){
      for (int spot : row){
        if (spot == -1){
          System.out.print("X ");
        }
        else{
          System.out.print(spot + " ");
        }
      }
      System.out.println();
    }
  }

  public static String[][] checkerBoard(int rows, int cols) {
    String[][] checkers = new String[rows][cols];
    for (int r = 0; r < checkers.length; r++) {
      for (int c = 0; c < checkers[0].length; c++) {
        if ((r + c) % 2 == 0) {
          checkers[r][c] = "X";
        } else {
          checkers[r][c] = "O";
        }

      }
    }
    return checkers;
  }

  public static void printBoard(String[][] board){
    for (String[] row : board){
      for (String spot : row){
        System.out.print(spot + " ");
      }
      System.out.println();
    }
  }

  public static double[][] randomBoard(int rows, int cols, double limit) {
    double[][] board = new double[rows][cols];
    for (int r = 0; r < board.length; r++) {
      for (int c = 0; c < board[0].length; c++) {
        board[r][c] = Math.random() * limit;
      }
    }
    return board;
  }

  public static void printBoard(double[][] board){
    for (double[] row : board){
      for (double spot : row) {
        spot = (int)(spot * 100)/100.0;
        System.out.print(spot + " ");
      }
      System.out.println();
    }
  }

  public static double sumOfOneOfTheRows(double[] row) {
    double sum = 0;
    for (int i = 0; i < row.length; i++) {
      sum += row[i];
    }
    return sum;
  }

  public static int maxSum(double[][] board) {
    int maxRow = 0;
    double maxValue = 0;
    for (int r = 0; r < board.length; r++) {
      double currentValue = sumOfOneOfTheRows(board[r]);
      if (currentValue > maxValue) {
        maxValue = currentValue;
        maxRow = r;
      }
    }
    return maxRow;
  }

  public static ArrayList<Integer> makeList(int num, int maxVal){
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i = 0; i < num; i++){
      int x = (int)((Math.random()) * (maxVal+1));
      list.add(x);
    }
    return list;
  }

  public static void printList(ArrayList<Integer> list){
    for(int num: list){
      System.out.print(num + ", ");
    }
  }

  public static ArrayList<Integer> primeList(int n){
    ArrayList<Integer> prime = new ArrayList<Integer>();
    int checc = 2;
    while(prime.size() < n){
      boolean sign = true;
      for (int j = 0; j < prime.size(); j++){
        if(checc % prime.get(j) == 0){
          sign = false;
        }
      }
      if(sign){
        prime.add(checc);
      }
      checc++;
    }
    return prime;
  }


}
