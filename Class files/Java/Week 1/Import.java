// The import statement

/*
 * The import statement allows us to import an entire package or use only certain
 * classes and interfaces defined in the package. The 'java.lang' package is
 * available by defaut
 */

import java.util.*;

public class Import {
  public static void main(String[] args) {
    System.out.println(new Random().nextInt(9) + 1);
    // 32 bits -> 2,147,483,647
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.TYPE);
    System.out.println(Math.PI);
    System.out.printf("%.2f\n", Math.PI);
  }
}
