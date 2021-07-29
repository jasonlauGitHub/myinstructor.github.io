// Challenge

// Write a method that accepts a string as an argument and returns a copy of
// the string with the first character of each sentence capitalized

// hello. my name is Joe. what is your name?
// Hello. My name is Joe. What is your name?

import java.util.*;

public class Capitalizer {
  public String capitalize(String str) {
    // The indexOf() method returns the position (index) of a character
    // Return -1 when the character is not found
    int period = str.indexOf(".");
    char[] chars = str.toCharArray();
    String string = "";
    chars[0] = Character.toUpperCase(chars[0]);

    while (period != -1) {
      chars[period + 2] = Character.toUpperCase(chars[period + 2]);
      period = str.indexOf(". ", period + 1);
    }

    for (char c : chars) {
      string += c;  // string = string + c
    }

    return string;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a phrase to be capitalized: ");
    String phase = scan.nextLine();

    System.out.println(new Capitalizer().capitalize(phase));
  }
}
