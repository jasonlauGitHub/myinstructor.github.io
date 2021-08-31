// The conditional operator (aka ternary operator)

/*
 * The conditional operator provides a shorthand method of expressing a simple
 * if-else statement
 */

public class If_03 {
  public static void main(String[] args) {
    int hour = 10;

    System.out.println((hour > 12) ? "Afternoon" : "Morning");

    String time = (hour > 12) ? "Afternoon" : "Morning";
    System.out.println(time);
  }
}
