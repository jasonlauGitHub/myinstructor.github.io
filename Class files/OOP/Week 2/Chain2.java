// Chaining methods

public class Chain2 {
  String name;

  public Chain2 setName(String name) {
    this.name = name;
    // Returning a reference to our own class
    return this;
  }

  public String getName() {
    return this.name;
  }

  public void printName() {
    System.out.println(this.getName());
  }

  public static void main(String[] args) {
    new Chain2().setName("John Doe").printName();
  }
}
