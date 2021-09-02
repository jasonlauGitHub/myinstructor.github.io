// Comparing arrays

// The Arrays class doesn't implement the equals method

public class Comparison {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};
    int[] b = new int[] {1, 2, 3, 4, 5};
    int[] c = a;

    System.out.println(a == b);
    System.out.println(a == c);
    System.out.println(b == c);

    System.out.println(a.equals(b));  // false
    System.out.println(a.equals(c));  // true
  }
}
