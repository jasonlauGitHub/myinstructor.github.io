// The do-while loop

/*
 * The 'do-while' executes instructions at least once
 */

public class While_01 {
  public static void main(String[] args) {
    int x = 5;

    if (x == 5) {
      do {
        System.out.println(x);
        x--;
      } while (x > 7);
    }
  }
}
