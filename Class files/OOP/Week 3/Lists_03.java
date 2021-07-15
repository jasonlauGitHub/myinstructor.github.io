// ArrayList (lists) methods

import java.util.*;

public class Lists_03 {
  public static void main(String[] args) {
    List<String> pets = new ArrayList<>();
    pets.add("Dog");
    pets.add("Cat");
    pets.add("Bird"); // 2
    pets.add("Cat");
    pets.add("Gold fish");
    pets.add("Cat");

    // set replaces element at index and returns the original value
    pets.set(2, "Otter");

    // get returns element at index
    String myFavPet = pets.get(1);
    System.out.println(myFavPet);

    int index1 = pets.indexOf("Cat");
    int index2 = pets.lastIndexOf("Cat");
    System.out.println(index1);
    System.out.println(index2);

    // Returns first matching index or -1 (element not found)
    System.out.println(pets.indexOf("Monkey"));
    // Returns last matching index or -1 (element not found)
    System.out.println(pets.lastIndexOf("Monkey"));

    System.out.println(pets);
  }
}
