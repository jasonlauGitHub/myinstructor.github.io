// Nested for loops

public class For_03 {
  public static void main(String[] args) {
    int[][] grid = {
      {11, 12, 13, 14},
      {21, 22, 23, 24},
      {31, 32, 33, 34},
      {41, 42, 43, 44}
    };
    // The length is the number of rows, or arrays
    System.out.println(grid.length + " arrays\n");
    int len = grid.length;

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(grid[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
