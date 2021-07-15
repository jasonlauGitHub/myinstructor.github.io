// ArrayList (lists) methods
// Lists are mutable

import java.util.*;

public class Lists_02 {
  public static void main(String[] args) {
    List<String> pets = new ArrayList<>();
    // Adds element to the end of the list and returns true or false (boolean)
    pets.add("Dog"); // 0
    pets.add("Cat"); // 1

    // Adds element at index and moves the toward the end (no return)
    pets.add(1, "Gold fish");
    System.out.println(pets);

    // Removes element at index - returns the element
    String myFavPet = pets.remove(0);

    System.out.println(myFavPet);
    System.out.println(pets);
  }
}
