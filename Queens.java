public class Queens {

  private static int count;

  public static void main(String[] args){
    int[][] board = new int[8][8];
    count = 0;
    queenPlacement(board, 0);
    System.out.println(count);
    System.out.println(skills(25, 5));
  }

  public static boolean isLegal(int[][] board, int r, int c){
    for(int i = 0; i < r; i++){
      if(board[i][c] == 1){
      return false;
      }
      int diff = r - i;
      if(c - diff >= 0 && board[i][c - diff] == 1){
        return false;
      }
      if(c + diff < board[i].length && board[i][c + diff] == 1){
        return false;
      }
    }
    return true;
  }
  public static boolean queenPlacement(int[][] board, int r){
    if(r==board.length){
      printBoard(board);
      count++;
      return false;
    }
    for(int i = 0; i < board[r].length; i++){
      if(isLegal(board, r, i)){
        board[r][i] = 1;
        if(queenPlacement(board, r+1)){
          return true;
        }else{
          board[r][i] = 0;
        }
      }
    }
    return false;
  }

  public static void printBoard(int[][] board){
    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[0].length; j++){
        if(board[i][j] == 0){
          System.out.print("_ ");
        }else{
          System.out.print("q ");
        }
      }
      System.out.println();
    }
    System.out.println();
  }

  public static int skills(int n, int m) {
    System.out.println(n + " " + m);
    if (n % 2 == 0) {
      return skills(n / 2) + m;
    } else {
      return skills(n - 1, m - 1);
    }
  }

  public static int skills(int n) {
    System.out.println(n);
    if (n == 0) {
      return 0;
    } else if (n % 2 == 0) {
      return skills(n, n / 2);
    } else {
      return skills(n - 1);
    }
  }
}
