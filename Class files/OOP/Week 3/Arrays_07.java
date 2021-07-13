// Creating an asymmetric array

import java.util.*;

public class Arrays_07 {
  public static void main(String[] args) {
    // Another example of 2D arrays
    int[][] asymmetric = {{1, 2}, {4}, {7, 8, 9}};

    // 1 | 2 |
    // 4 |
    // 7 | 8 | 9 |

    for (int i = 0; i < asymmetric.length; i++) {
      for (int j = 0; j < asymmetric[i].length; j++) {
        System.out.print(asymmetric[i][j] + " | ");
      }
      System.out.println();
    }
  }
}
