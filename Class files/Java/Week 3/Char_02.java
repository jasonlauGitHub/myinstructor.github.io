// The Character class

/*
 * isLetter()
 *
 * Methods names that start with "is" return a boolean value (Java beans)
 *
 */

public class Char_02 {
  public static void main(String[] args) {
    char r = 'r';
    char n = '7';

    // Conditional operator (simple/short if-else statement)
    System.out.println(Character.isLetter(r) ? "Is a letter" : "Not a letter");
    System.out.println(Character.isLetter(n) ? "Is a letter" : "Not a letter");
  }
}
