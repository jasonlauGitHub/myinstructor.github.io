// Shifting elements in an array

import java.util.Arrays;

public class Arrays_12 {
  public static void main(String[] args) {
    // Here, we are not copying the array
    int[] a = {1, 2, 3, 4, 5};
    int[] b = new int[a.length];

    System.arraycopy(a, 0, b, 1, a.length - 1);

    System.out.println("a | b");
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i] + " | " + b[i]);
    }
  }
}
