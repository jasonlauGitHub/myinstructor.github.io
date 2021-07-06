// Creating my own constructor

/*
 * There are 2 key points to note about the constructors:
 * the name of the constructor matches the name of the class
 * and there is no return type
 */

import static java.lang.System.*;

public class MyConstructor {
  String name;
  int age;

  MyConstructor(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Overriding the toString() method of the Object class
  @Override
  public String toString() {
    String str = this.name + ", " + this.age;
    return str;
  }

  public static void main(String[] args) {
    // Since a constructor is coded, a default constructor isn't supplied
    MyConstructor mc = new MyConstructor("John Doe", 41);

    out.println(mc);
  }
}
