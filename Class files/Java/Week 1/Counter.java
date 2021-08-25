// Increment - counter

public class Counter {
  public static void main(String[] args) {
    int count = 0;

    for (int i = 0; i < 5; i++) {
      System.out.println(i + 1 + ": I am in a loop");
      count++;
    }

    System.out.println(count);
  }
}
