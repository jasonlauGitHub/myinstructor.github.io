// Arrays

import java.util.*;

public class Arrays_02 {
  public static void main(String[] args) {
    int[] a1 = {1, 2, 3, 4, 5, 6};
    int[] a2 = a1;

    int[] a3 = new int[] {1, 2, 3, 4, 5, 6};
    int[] a4 = new int[] {1, 2, 3, 4, 5, 6};

    // Both == operator and equals() check the reference, not the content
    // of the array. The Arrays class doesn't override the equals method in
    // the Object class

    System.out.println(a1 == a2);
    System.out.println(a3 == a4);
    System.out.println(a3.equals(a4));
  }
}
