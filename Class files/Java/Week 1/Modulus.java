// Modulus operator

/*
 * The modulus, or remainder operator (%), is simply the remainder when two
 * number are divided
 */

public class Modulus {
  public static void main(String[] args) {
    int res = 16 % 5;
    // System.out.println(res);

    int num = 0;
    // What is an even number?
    if (num % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  }
}
