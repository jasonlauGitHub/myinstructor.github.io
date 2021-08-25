// Numeric promotion

/*
 * If one of an operator's operands is an int, and the other operand is a
 * double, Java will automatically convert the value of the int to a double
 */

public class Promotion {
  public static void main(String[] args) {
    int a = 5;
    int b = 5;
    double c = 5.0;
    int d = 0;

    System.out.println(a + b);
    System.out.println(a + c); // double - numeric promotion

    // Error: incompatible types: possible lossy conversion from double to int
    // d = a + c;

    System.out.println(a == b);
    System.out.println(a == c);
  }
}
