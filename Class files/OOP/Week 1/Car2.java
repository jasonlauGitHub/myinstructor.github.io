// Creating classes and objects (part II)

/*
 * Project: Learning OOP
 * Programming language: Java
 * Instructor: Andre Specht
 *
 */

public class Car2 {
  String model;
  String colour;
  String engineType;

  public void print() {
    // 'this' points to the class variable
    System.out.println(this.model);
    // No return here
  }

  public String engine() {
    String sentence = "This car has the " + this.engineType + " engine";
    return sentence;
  }

  public static void main(String[] args) {
    Car2 car = new Car2();
    car.model = "2022 GTX";
    car.engineType = "457 VX Turbo";

    car.print();

    // Getting the 'return'
    String str = car.engine();
    System.out.println(str);
  }
}
