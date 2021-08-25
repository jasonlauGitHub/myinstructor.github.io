// Variable scope

public class Scope {
  public static void main(String[] args) {
    int a = 5;

    if (a > 1) {
      int b = 10;
    }

    // Error: cannot find symbol 'b'
    // System.out.println(b);

    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }
  }
}
