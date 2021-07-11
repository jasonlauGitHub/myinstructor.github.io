// Equals

public class Equals {
  public static void main(String[] args) {
    int a = 5;
    int b = 5;
    double c = 5.0;

    // The equals operator (==) returns true or false
    // System.out.println(a == b);

    // Numeric promotion
    // System.out.println(a == c);

    // Literal string (pool of strings)
    String name1 = "Andre";
    String name2 = "Andre";
    System.out.println(name1 == name2); // true

    // Creating objects/instances
    String name3 = new String("John");
    String name4 = new String("John");
    System.out.println(name3 == name4); // false (different objects)
  }
}
