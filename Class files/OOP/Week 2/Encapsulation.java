// Encapsulation

// Private instance variables and public methods
// Getters and setters
// The proper way to create a class

public class Encapsulation {
  // this -> instance variables
  private String name;
  private int age;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public static void main(String[] args) {
    Encapsulation enc = new Encapsulation();
    enc.setName("Andre Specht");
    enc.setAge(38);

    System.out.println("Name: " + enc.getName());
    System.out.println("Age: " + enc.getAge());
  }
}
