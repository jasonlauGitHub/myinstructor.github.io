// Multidimensional arrays

public class Arrays_05 {
  public static void main(String[] args) {
    int[][] grid = {
      {11, 12, 13, 13},
      {21, 22, 23, 24},
      {31, 32, 33, 34},
      {41, 42, 43, 44},
      {51, 52, 53, 54}
    };

    // Nested for loop
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(grid[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println(grid.length); // first dimension | number of rows
  }
}
