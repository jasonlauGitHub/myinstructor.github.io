// Identifiers

/*
 * An identifier is a programmer-defined name that represents some element of
 * a program (class, method, variable etc)
 */

// Naming convention

public class Identifiers {
  public static void main(String[] args) {
    int num = 1;
    int $ = 2;
    int _num_ = 3;
    String $name = "Andre";

    String postalCode = "A3B 3C5";

    int million = 1_000_000; // + readable

    System.out.println(num);
    System.out.println($);
    System.out.println(_num_);
    System.out.println($name);
    System.out.println(million);
    System.out.println("Hello world"); // Literal
  }
}
