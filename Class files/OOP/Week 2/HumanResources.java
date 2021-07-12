// Inheritance and polymorphism

// Parent class || superclass
class Employee {
  int id;
  String name;
  String job;

  public void jobTitle() {
    System.out.println("Employee");
  }
}

// Child class || subclass
// Driver "is a" Employee
class Driver extends Employee {
  public void jobTitle() {
    System.out.println("Driver");
  }
}

class Supervisor extends Employee {
  public void jobTitle() {
    System.out.println("Supervisor");
  }
}

class Manager extends Employee {
  public void jobTitle() {
    System.out.println("Manager");
  }
}

public class HumanResources {
  public static void main(String[] args) {
    Employee[] emp = new Employee[3];
    emp[0] = new Driver();
    emp[1] = new Supervisor();
    emp[2] = new Manager();

    for (int i = 0; i < emp.length; i++) {
      emp[i].jobTitle();
    }

    // Part 2 (class #6)
    // for (int j = 0; j < emp.length; j++) {
      // instanceof returns true or false
    //  System.out.println(emp[j] instanceof Employee); // true
    // }

    // Setting values to instance variables (class fields)
    Driver driver = new Driver();
    driver.id = 1234;
    driver.name = "Jack Smith";
    driver.job = "Driver";

    System.out.println(driver.id);
    System.out.println(driver.name);
    System.out.println(driver.job);
  }
}