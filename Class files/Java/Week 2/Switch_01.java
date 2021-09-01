// The switch-case statement

/*
 * The 'switch-case' statement is a complex decision-making structure in which
 * a single value is evaluated and flow is redirected to the first matching
 * branch, known as a 'case' statement
 */

public class Switch_01 {
  public static void main(String[] args) {
    String hero = "Batman";

    switch(hero) {
      case "Batman":
        System.out.println("DC");
        break;
      case "Spider-man":
        System.out.println("Marvel");
        break;
      case "Spawn":
        System.out.println("Image");
        break;
    }
  }
}
