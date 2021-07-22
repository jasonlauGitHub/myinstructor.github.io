// Logical operators

/*
 * Short-circuit logical operators
 * &&, ||
 *
 */

public class Logical_01 {
  public static void main(String[] args) {
    int x = 5;
    int y = 8;

    if (x > 0 && y > 0) {
      System.out.println("Yay 1");
    } else {
      System.out.println("No 1");
    }

    if (x > 0 || y > 10) {
      System.out.println("Yay 2");
    } else {
      System.out.println("No 2");
    }

    if (x > 5 || ++y == 9) {
      System.out.println("Yay 3");
      System.out.println(y);
    } else {
      System.out.println("No 3");
    }

  }
}
