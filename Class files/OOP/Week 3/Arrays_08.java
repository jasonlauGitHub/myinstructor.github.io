// Creating an 3D array

import java.util.*;

public class Arrays_08 {
  public static void main(String[] args) {
    int[][][] array3d = new int[3][4][5];
    int count = 0;

    for (int i = 0; i < array3d.length; i++) {
      for (int j = 0; j < array3d[i].length; j++) {
        for (int k = 0; k < array3d[i][j].length; k++) {
          array3d[i][j][k] = i + j + k;
          count += 1;
        }
      }
    }

    System.out.println(count);

    // Enhanced for
    for (int[][] arr1 : array3d) {
      for (int[] arr2 : arr1) {
        for (int item : arr2) {
          System.out.print(item + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}
