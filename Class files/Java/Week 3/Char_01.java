// The Character class

/*
 * The Character class is a wrapper class for the char data type. It provides
 * numerous methods for testing and converting character data
 *
 * isDigit()    // Java beans - boolean
 * isLetter()
 * isLetterOrDigit()
 */

public class Char_01 {
  public static void main(String[] args) {
    // In Java, a digit == a number
    char r = 'r';
    char n = '7';

    // Conditionar operator (simple/short if-else statement)
    System.out.println(Character.isDigit(r) ? "Is a number" : "Not a number");
    System.out.println(Character.isDigit(n) ? "Is a number" : "Not a number");
  }
}
