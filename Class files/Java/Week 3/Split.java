// String methods (part 2)

/*
 * Tokenizing string is a process of breaking a string down into its components,
 * which are called tokens. The String class' spilt() method can be used to
 * tokenize strings
 *
 * The split() method returns an array
 */

import java.util.*;

public class Split {
  public static void main(String[] args) {
    String beatles = "John, Paul, George, Ringo";
    String[] arr = beatles.split(", ");

    // enhanced for (aka for-each)
    for (String member : arr) {
      System.out.println(member);
    }

    System.out.println(Arrays.toString(arr));
  }
}
