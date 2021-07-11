// Creating classes and objects

/*
 * Project: Learning OOP
 * Programming language: Java
 * Instructor: Andre Specht
 *
 */

public class Car1 {
  // Classes have 'class members'
  // Class fields (variables)
  // Class methods (functions/producedures)

  // Instance variables have default values
  String model; // null
  String colour;
  String engineType;
  int doors;  // 0

  public static void main(String[] args) {
    // Local variable have be initialized (no default values)
    // int number = 45;

    // An object/instance of the class 'Car'
    Car1 car1 = new Car1();
    Car1 car2 = new Car1();

    car1.model = "2022 GT";
    car2.model = "2011 SL";

    System.out.println(car1.model);
    System.out.println(car1.doors); // Printing the default value (instance)
    System.out.println(car2.model);
  }
}
