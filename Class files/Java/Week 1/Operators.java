// Operators & precedence

// ++, --
// * /
// + -

// ++ increment operator
// -- decrement operator

public class Operators {
  public static void main(String[] args) {
    int x = 9;

    int y = 13 - x++;          // 9
    // System.out.println(y);  // 4
    // System.out.println(x);  // 10

    int z = 3 * y - x / 2;
    // System.out.println(z);  // 7

    int count = 0;
    count = count + 1;
    System.out.println(count);

    count = 0;
    count++;
    System.out.println(count);

    count = 0;
    count += 1;
    System.out.println(count);

    // count = count + 1 == ++count == count += 1
  }
}
