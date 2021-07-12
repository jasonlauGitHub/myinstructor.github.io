// Working with arrays

// Arrays are homogeneous data structures that are implemented as objects.
// They are mutable, have fixed size and can be multidimensional

public class Arrays_01 {
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = new int[5]; // 5 is the length

    String[] arr3 = {"John", "Jack", "Jerry", null};
    String[] arr4 = new String[3];

    // System.out.println(arr1); This prints the id (location) of the object,
    // not its content

    for (int i = 0; i < arr3.length; i++) {
      System.out.println(arr3[i]);
    }
  }
}
