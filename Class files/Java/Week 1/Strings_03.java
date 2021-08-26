// The String class and its methods

public class Strings {
  public static void main(String[] args) {
    String city = "Winnipeg";

    System.out.println(city.equals("Winnipeg"));
    System.out.println(city.equals("WINNIPEG"));
    System.out.println(city.equalsIgnoreCase("WINNIPEG"));

    System.out.println(city.indexOf("p"));
    System.out.println(city.indexOf("i"));
    System.out.println(city.indexOf("nn"));

    System.out.println(city.charAt(5));
  }
}
