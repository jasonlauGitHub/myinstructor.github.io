// Comparing strings

public class Comparison_02 {
  public static void main(String[] args) {
    String name = "Andre"; // pool of strings
    String otherName = "Andre";

    System.out.println(name == otherName); // true (same string)

    // The 'new' operator means a constructor - we are creating an object
    String brand = new String("Samsung"); // This is an object
    String otherBrand = new String("Samsung");

    System.out.println(brand == otherBrand); // false: two different objects
    System.out.println(brand.equals(otherBrand)); // true
  }
}
