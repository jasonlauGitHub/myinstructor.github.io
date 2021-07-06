// Method overloading

/*
 * Method overloading occurs when there a different method signature with
 * the same name but different type parameters. Overloaded methods may have
 * different access modifiers and return types
 */

public class Overloading {
  public static void numbers(int a) {
    System.out.println("1 argument");
  }

  public static void numbers(int a, int b) {
    System.out.println("2 arguments");
  }

  public static void numbers(int[] array) {
    System.out.println("Multiple arguments");
  }

  public static void main(String[] args) {
    int[] sequence = {4, 5, 6, 7, 8, 9};
    numbers(sequence);

    numbers(3, 7);
    numbers(1);
  }
}
