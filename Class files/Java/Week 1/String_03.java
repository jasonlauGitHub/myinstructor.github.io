// String class / Strings

public class String_03 {
  public static void main(String[] args) {
    String s1 = "99";
    String s2 = "55";

    int n1 = 1;
    int n2 = 2;

    System.out.println(s1 + s2);
    System.out.println(s1 + n1);
    System.out.println(n1 + n2);
    System.out.println(s1 + n1 + n2);
    System.out.println(s1 + (n1 + n2));
    System.out.println(n1 + n2 + s1);
  }
}