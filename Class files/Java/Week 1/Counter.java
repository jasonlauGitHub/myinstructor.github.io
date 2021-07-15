// Increment operator (post-unary operator) in counter

public class Counter {
  public static void main(String[] args) {
    int counter = 0;

    for (int i = 0; i < 5; i++) {
      System.out.println(++counter);
    }
    System.out.println("My result is: " + counter);
  }
}
