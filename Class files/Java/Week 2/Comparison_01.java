// Numeric promotion

// double + int == double

public class Comparison_01 {
  public static void main(String[] args) {
    int a = 5;
    int b = 5;
    double c = 5.0;
    int d = 7;

    System.out.println(a == b);
    System.out.println(a == d);
    System.out.println(a == c); // numeric promotion
  }
}
