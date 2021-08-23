// Reference types

/*
 * A reference type refers to an object. Unlike primitive types that hold their
 * values in the memory where the variable is allocated, reference types point
 * to an object by storing the memory address where the object is allocated
 */

public class References {
  // Another method here

  public static void main(String[] args) {
    String name1 = "John Smith"; // pool of strings
    String name2 = "John Smith";

    // The 'new' operator means a constructor - we are creating an object
    String brand1 = new String("Samsung");
    String brand2 = new String("Samsung");

    // Creating an object from the 'References' class
    References ref = new References();
  }
}
