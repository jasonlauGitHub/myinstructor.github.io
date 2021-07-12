// Identifiers

/*
 * An indentifier is a programmer-defined name that represents some element of
 * a program (class, method, variable)
 */

public class Identifiers {
  public static void main(String[] args) {
    int num = 1;
    int $ = 2;
    int _num_ = 3;
    String $name = "Andre";

    int $2 = 2;

    int million = 1_000_000; // readable

    System.out.println(num);
    System.out.println($);
    System.out.println(_num_);
    System.out.println($name);
    System.out.println($2);
    System.out.println(million);

    // You can't create variable name that start with a number
  }
}
