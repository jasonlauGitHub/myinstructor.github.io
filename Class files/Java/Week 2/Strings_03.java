// Validating strings


public class Strings_03 {
  public static void main(String[] args) {
    String empty = "";
    String blank = "    ";
    String name = "Jerry";

    System.out.println(empty.isEmpty());
    System.out.println(blank.isEmpty());
    System.out.println(blank.isBlank());

    // Validation
    if (!name.isBlank()) {
      System.out.println("Name is valid");
    } else {
      System.out.println("Name is not valid");
    }
  }
}
