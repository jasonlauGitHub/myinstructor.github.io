// Input validation

// Methods are basically blocks (components) of code you can reuse
// String -> ['S', 't', 'r', 'i', 'n', 'g']

// The process of validate an input depends on the project requirements
// Validation is not an exact science
// Regex (regular expression)

public class Validation {
  public boolean validate(String str) {
    // Creating an array of characters
    char[] chars = str.toCharArray();
    boolean isValid = true;

    for (char c : chars) {
      if (!Character.isDigit(c)) {
        isValid = false;
      }
    }
    return isValid;
  }

  public static void main(String[] args) {
    String sin = "333666999";

    if (!sin.isBlank() && sin.length() == 9) {
      if (new Validation().validate(sin)) {
        System.out.println("SIN is valid");
      } else {
        System.out.println("SIN contains invalid characters");
      }
    } else {
      System.out.println("Please enter a 9-digit SIN");
    }
  }
}
