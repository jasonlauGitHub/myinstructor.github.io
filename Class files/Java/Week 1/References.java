// Reference types

/*
 * A reference type refers to an object. Unlike primitive types that hold their
 * values in the memory where the variable is allocated, reference types point
 * to an object by storing the memory address where the object is located
 */

public class References {
  public static void main(String[] args) {
    String name = "Andre"; // pool of strings
    String otherName = "Andre";

    System.out.println(name == otherName);

    // The 'new' operator means a constructor - we are creating an object
    String brand = new String("Samsung"); // This is an object
    String otherBrand = new String("Samsung");

    System.out.println(brand == otherBrand);
    System.out.println(brand.equals(otherBrand));
  }
}
