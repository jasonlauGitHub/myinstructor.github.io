// Arrays are mutable
// Strings are immuttable

// We CAN'T change Strings. They are immutable

public class Immutable {
  public static void main(String[] args) {
    String name = "andre"; // reference to an object in memory
    name = "john"; // the same reference is pointing to a different object

    System.out.println(name.toUpperCase());
    System.out.println(name);
  }
}
