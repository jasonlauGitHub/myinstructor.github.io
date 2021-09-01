// The if-else statement + logical operators

public class If_04 {
  public static void main(String[] args) {
    boolean ready1 = true;
    boolean ready2 = false;
    boolean flag = true;

    if (ready1) {
      System.out.println("You are ready");
    } else {
      System.out.println("You are not ready");
    }

    // && - AND (both true)
    // || - OR (either one must be true)

    if (ready1 || ready2) {
      System.out.println("You are ready (2)");
    } else {
      System.out.println("You are not ready (2)");
    }

    if (flag = false) {
      System.out.println("If (true))");
    } else {
      System.out.println("Else (false)");
    }
  }
}
