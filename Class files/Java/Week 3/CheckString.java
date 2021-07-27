// Checking the content of a string

public class CheckString {
  public static void main(String[] args) {
    String empty = "";
    String blank = "   ";   // not empty, but blank
    String name = "John Doe";

    System.out.println(empty.isEmpty());
    System.out.println(blank.isBlank());
    System.out.println(blank.isEmpty());
    System.out.println(name.isEmpty());
    System.out.println(name.isBlank());
  }
}
