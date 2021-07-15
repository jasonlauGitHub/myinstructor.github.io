// ArrayList (lists) methods

import java.util.*;
// import static java.util.Collections.*;

public class Lists_04 {
  public static void main(String[] args) {
    // Returns a fixed-size list backed by the specified array
    List<String> beatles = Arrays.asList("Paul", "George", "Ringo", "John");

    Collections.sort(beatles);
    System.out.println(beatles);

    System.out.println("Classic for loop");

    // beatles.size() (lists) instead of beatles.length (arrays)
    for (int i = 0; i < beatles.size(); i++) {
      System.out.println(beatles.get(i));
    }

    System.out.println("\nEnhanced for loop");
    // Enhanced for aka for-each
    // We can't access the index
    for (String name : beatles) {
      System.out.println(name);
    }

    // forEach method (requires a Consumer as argument)
    beatles.forEach(System.out::println);
  }
}
