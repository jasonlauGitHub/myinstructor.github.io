// Modulus operator

/*
 * The modulus, or the remainder operator (%), is simply the remainder when
 * two numbers are divided
 */

public class Modulus {
  public static void main(String[] args) {
    int res = 16 % 5;
    System.out.println(res);

    int num = 10;
    // Sumple validation
    if (num > 0) {
      if (num % 2 == 0) {
        System.out.println("Even");
      } else {
        System.out.println("Odd");
      }
    } else {
      System.out.println("Zero is not allowed");
    }
  }
}
