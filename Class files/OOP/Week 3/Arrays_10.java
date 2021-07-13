// Binary search

/*
 * When a value is not found, the program determines its probable
 * position, negates it and subtracts 1
 */

 import java.util.Arrays;

public class Arrays_10 {
  public static void main(String[] args) {
    int[] a = {5, 2, 3, 1, 4};
    // sort() is required before binarySearch()
    // 1, 2, 3, 4, 5 -> the items (elements)
    // 0, 1, 2, 3, 4 -> the indexes (positions)
    Arrays.sort(a);

    System.out.println(Arrays.binarySearch(a, 2)); // 1

    System.out.println(Arrays.binarySearch(a, 5)); // 4

    // -6 (-5 -1)
    System.out.println(Arrays.binarySearch(a, 7)); // -6

    // -1 (0 -1)
    System.out.println(Arrays.binarySearch(a, -4)); // -1
  }
}
