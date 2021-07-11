// References

public class References {
  public static void main(String[] args) {
    // A reference type (String, Array, your own class' objects) refers
    // to an object. Unlike primitive types that hold their values in
    // the memory where the variable is allocated

    // The 'new' operator is the class constructor
    // We use it to create objects/instances
    String firstName = new String(" John ");
    String lastName = new String("Doe");

    // Java classes have their own (bult-in) methods
    // But we can create our own classes and custom methods
    System.out.println(firstName);
    System.out.println(firstName + "has " + firstName.length() + " characters");

    String firstName2 = firstName.trim();
    System.out.println(firstName2);
    System.out.println("Now " + firstName2 + " has " + firstName2.length() + " characters");
  }
}
