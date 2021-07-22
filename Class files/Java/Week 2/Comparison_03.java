// Comparing arrays

/*
 * The Arrays class doesn't implement the equals method. That means, in Arrays, both
 * == operator and the equals() method check the reference, not the elements of
 * the array. (By default, equals checks the reference)
 */

public class Comparison_03 {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};
    int[] b = new int[] {1, 2, 3, 4, 5};
    int[] c = a;

    System.out.println(a == b);
    System.out.println(a == c);
    System.out.println(b == c);

    System.out.println(a.equals(b));
    System.out.println(a.equals(c));
  }
}
