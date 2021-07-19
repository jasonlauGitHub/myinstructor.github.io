// The enhanced for (aka for-each)

/*
 * The enhanced for loop is designed to iterate once for every element in an
 * array. Each time the loop iterates, it copies an array element to a
 * variable
 *
 * for (type elementVar : array)
 */

import java.util.Arrays;

public class For_01 {
  public static void main(String[] args) {
    String[] names = new String[3];
    names[0] = "John";
    names[1] = "Mary";
    names[2] = "Henry";

    for (String name : names)
      System.out.println(name);
  }
}
