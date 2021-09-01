// The if-else statement

/*
 * The 'if-else' statement will execute one group of statements if its boolean
 * expression is true
 */

public class If_01 {
  public static void main(String[] args) {
    int hour = 10;
    int count = 0;

    if (hour < 12) {
      System.out.println("Good morning");
      count++;
    }
    System.out.println(count);
  }
}
