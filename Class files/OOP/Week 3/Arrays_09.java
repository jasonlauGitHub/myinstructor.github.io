// Comparing arrays

import java.util.*;

public class Arrays_08 {
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = arr1;
    // Two references poiting to the same array

    int[] arr3 = new int[] {1, 2, 3, 4, 5};
    int[] arr4 = new int[] {1, 2, 3, 4, 5};
    // Two references pointing to two different objects

    System.out.println(arr1 == arr2);
    System.out.println(arr1.equals(arr2));

    System.out.println(arr3 == arr4);
    System.out.println(arr3.equals(arr4));
    // Both (== operator and equals()) have the beahaviour
    // By default, the equals() method checks the references, not the content
    // Object class has a equals() method
  }
}
