// Validating strings

public class Strings {
  public static void main(String[] args) {
    String name = "John Smith";
    String empty = "";
    String blank = " ";

    System.out.println(name.isEmpty());
    System.out.println(name.isBlank());

    System.out.println(empty.isEmpty());
    System.out.println(empty.isBlank());
    System.out.println(blank.isEmpty());
    System.out.println(blank.isBlank());
  }
}
