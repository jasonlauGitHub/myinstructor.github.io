// Parent class' constructor

// Vehicle (superclass/parent class)

class Vehicle {
  String engine;

  Vehicle(String engine) {
    this.engine = engine;
  }

  public String getEngine() {
    return this.engine;
  }
}

class Car extends Vehicle {
  String model;

  Car(String engine, String model) {
    super(engine);
    this.model = model;
  }

  public void print() {
    System.out.println("The model " + this.model + " comes with the " + this.engine + " enigne");
  }
}

public class ParentsConstructor {
  public static void main(String[] args) {
    Car c = new Car("GT Turbo", "Atlas 2022");
    c.print();
  }
}
