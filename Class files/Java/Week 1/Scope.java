// Variable scope

public class Scope {
  public static void main(String[] args) {
    int a = 7;

    if (a > 5) {
      int b = 10;
    }

    // Error: cannot find symbol 'b'
    System.out.println(b);
  }
}
