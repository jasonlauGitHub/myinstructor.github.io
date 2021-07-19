// The if statement

public class If_03 {
  public static void main(String[] args) {
    boolean ready1 = true;
    boolean ready2 = true;

    boolean flag = false;

    if (ready1) {
      System.out.println("You are ready");
    } else {
      System.out.println("You are not ready");
    }

    if (ready1 && ready2) {
      System.out.println("All good");
    } else {
      System.out.println("Not that good");
    }

    if (flag = false) {
      System.out.println("If (true)");
    } else {
      System.out.println("Else (false)"); // <-
    }
  }
}
