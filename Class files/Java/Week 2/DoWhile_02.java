// The do-while loop

public class DoWhile_02 {
  public static void main(String[] args) {
    int x = 5;

    if (x == 5) {
      do {
        System.out.println(x);
        x--;
      } while (x > 7);
    }
    System.out.println(x);
  }
}
