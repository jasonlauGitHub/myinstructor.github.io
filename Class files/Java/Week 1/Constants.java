// Constants

/*
 * The final keyword can be used in a variable declaration to make the
 * variable a named constant. Named constants are initialized with a value,
 * and that value cannot change during the execution of the program
 */

public class Constants {
  public static void main(String[] args) {
    final int ID = 7;
    final String FIRST_NAME = "John Smith";

    // Java is case sensitive id != ID
    // Naming convention is important
    System.out.println(ID);
    System.out.println(FIRST_NAME);
  }
}
