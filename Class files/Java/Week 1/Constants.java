// Constants

/*
 * The 'final' keyword can be used in a variable declaration to make the
 * variable a named constant. Named constant are initialized with a value, and
 * that value cannot change during the execution of the program
 */

public class Constants {
  public static void main(String[] args) {
    final int ID = 45678;
    final String FULL_NAME = "John Smith";
    final int SIN = 333666999;

    // Java is case sensitive 'id' != 'ID' != 'Id'
    // Naming convention is important
    System.out.println(ID);
    System.out.println(FULL_NAME);
    System.out.println(SIN);
  }
}
