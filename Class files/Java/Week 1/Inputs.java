// Reading user inputs

import java.util.*;

public class Inputs {
  public static void main(String[] args) {
    String name = "";
    int age = 0;

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your name: ");
    // nextLine() to read string/ text
    // nextInt() to read integers (primitive)
    // nextDouble() to read doubles (primitives)
    name = scan.nextLine();

    System.out.print("Enter your age: ");
    // We can use the 'parse...' methods to change types
    age = Integer.parseInt(scan.nextLine());

    System.out.println("You are, " + age + " years old\n");
  }
}
