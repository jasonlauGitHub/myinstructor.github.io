// Wrapper classes

/*
 *  The Java API provides wrapper classes for each of the numeric data types.
 *  These classes have methods that perform useful operations involving
 *  primitive numeric values
 */

public class Wrapper_01 {
  public static void main(String[] args) {
    String s = "23";
    int i = 45;

    System.out.println(s + i); // string

    int num = Integer.parseInt(s);
    String str = Integer.toString(num);
    System.out.println(num + i); // these are int

    System.out.println(str + i); // these are int

    // Scanner <- String, int, double
  }
}
