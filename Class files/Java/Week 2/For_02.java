// The enhanced for (aka for-each)

/*
 *  The enhance for loop is designed to iterate once for every element in an
 *  array. Each time the loop iterates, it copies an array element to a variable
 *
 *  for (type elementVar : array) { }
 */

public class For_02 {
  public static void main(String[] args) {
    String[] names = {"John", "Mary", "Henry"};

    for (String name : names) {
      System.out.println(name);
    }
  }
}
