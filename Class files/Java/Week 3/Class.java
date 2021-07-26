// Classes and objects
// Naming convention: classes CamelCase, mySuperMethod, mySuperVarable

public class Class {
  // Instance variables - have default values
  String name;

  public void print(name) {
    System.out.println(this.name);
  }

  public static void main(String[] args) {
    Class c = new Class();
    c.name = "John Smith";
    c.print();

    Class newClass = new Class();
    newClass.name = "Mary Helen";
    newClass.print();
  }
}
