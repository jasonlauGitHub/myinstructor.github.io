// Copying an array

import java.util.Arrays;

public class Arrays_11 {
  public static void main(String[] args) {
    // Here, we are not copying the array
    int[] a = {1, 2, 3, 4, 5};
    int[] b = a;

    // b[0] = 999;

    int[] c = a.clone();
    b[0] = 0;

    int[] d = new int[a.length];
    System.arraycopy(c, 0, d, 0, 5);

    c[0] = 9;

    System.out.println("a | b | c | d");
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i] + " | " + b[i] + " | " + c[i] + " | " + d[i]);
    }
  }
}
