// Reading inputs (the Scanner class)

import java.util.*;

public class Inputs {
  // Instance variables
  String name; // null
  int age;     // 0

  public static void main(String[] args) {
    Inputs in = new Inputs();
    Scanner scan = new Scanner(System.in);

    System.out.println(in.name);
    System.out.println(in.age);

    System.out.print("Enter your full name: ");
    in.name = scan.nextLine();

    System.out.print("Enter your age: ");
    in.age = scan.nextInt();

    System.out.println(in.name + " | " + in.age);
    scan.close();
  }
}
