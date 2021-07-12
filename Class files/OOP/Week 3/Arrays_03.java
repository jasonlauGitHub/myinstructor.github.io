// Working with arrays

public class Arrays_03 {
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 4, 5, 6, 7};

    System.out.println(arr1.length); // The length of the array
    System.out.println(arr1[6]);

    for (int i = 0; i < arr1.length; i++) {
      System.out.println("Item " + (i + 1)  + ": " + arr1[i] + " ");
    }
  }
}
