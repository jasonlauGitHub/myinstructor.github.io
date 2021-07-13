// The sort() method
// Arrays are mutable

// java.lang package is imported by default
import java.util.*;
import static java.util.Arrays.*; // using import static

public class Arrays_06 {
  public static void main(String[] args) {
    int[] arr = {3, 5, 1, 4, 2};

    sort(arr);

    // for-each -  enhanced for
    for (int num : arr)
      System.out.print(num + " ");

    System.out.println();
  }
}
