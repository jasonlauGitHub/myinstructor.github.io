// Hello world

public class Scope {
  public static void main(String[] args) {
    int a = 6;

    if (a > 0) {
      // 'b' is a local variable; it belongs to this block of code
      int b = a * 2;
      System.out.println(a + " | " + b);
    }

    // This method can't find b
    // Compiler will generate and error (can't compile);
    System.out.println(b);
  }
}
