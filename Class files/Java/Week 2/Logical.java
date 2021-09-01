// Logical operators
// &&, || short-circuit logical operators

public class Template {
  public static void main(String[] args) {
    int x = 5;
    int y = 8;

    if (x > 0 && y > 0) {
      System.out.println("Good");
    } else {
      System.out.println("Not good");
    }

    if (x > 0 || y > 10) {
      System.out.println("Good");
    } else {
      System.out.println("Not good");
    }

    if (x > 12 || ++y == 9) {
      System.out.println("Good");
    } else {
      System.out.println("Not good");
    }

    System.out.println(y);
  }
}
