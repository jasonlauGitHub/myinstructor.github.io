// The Character class

/*
 * isLetterOrDigit()
 */

public class Char_03 {
  public static void main(String[] args) {
    char r = 'r';
    char n = '7';
    char x = '-';

    System.out.println(Character.isLetterOrDigit(r) ? "Valid" : "Not valid");
    System.out.println(Character.isLetterOrDigit(n) ? "Valid" : "Not valid");
    System.out.println(Character.isLetterOrDigit(x) ? "Valid" : "Not valid");
  }
}
