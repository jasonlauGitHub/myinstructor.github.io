// Parsing numbers

public class Parse_01 {
  public static void main(String[] args) {
    String s1 = "2";
    String s2 = "3.4";
    int i = 2;

    System.out.println(Integer.parseInt(s1) + Double.parseDouble(s2));
    // 5.4 is a double <- numeric promotion

    if (Integer.parseInt(s1) == i) {
      System.out.println("They are equal");
    }
  }
}
