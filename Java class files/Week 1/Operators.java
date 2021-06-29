// Java Operators

public class Operators {
  public static void main(String[] args) {
    int a = 6;
    int b = 3;

    int plus = a + b;
    int minus = a - b;
    int times = a * b;
    int by = a / b;

    // Increment and decrement operators
    // a = a + 1 -> ++a
    // System.out.println(++a);  // a + 1 == 7
    // System.out.println(a++);  // a + 1 = 8
    // System.out.println(a);  // a is 8

    // System.out.println(--a);  // a - 1 == 7
    // System.out.println(a--);  // a - 1 == 6
    // System.out.println(a);  // a is 6

    // Operator precedence
    int x = 9;
    int y = 13 - x++;
    System.out.println(y);

    // y == 4
    // x = 10

    int z = 3 * y - (x / 2);
    System.out.println(z);
  }
}
