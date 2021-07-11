// Constructor

import static java.lang.System.*;

public class Constructor {
  String name; // null
  int id;

  public static void main(String[] args) {
    // Constructor is the class
    // 'c' is the reference to an object
    // 'new Constructor()' is the default constructor
    Constructor c = new Constructor();
    c.name = "Java default constructor";
    c.id = 1234;

    out.println(c.name);
    out.println(c.id);
  }
}
