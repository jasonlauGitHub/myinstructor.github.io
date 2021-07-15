// Break statement

/*
 * 'break' is a statement that causes the control flow to exit the loop
 * and retruns control to the enclosing statement
 */

public class FlowControl {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6};

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 3) {
        System.out.println(arr[i]); // unreachable
        break; // Stop
      }
    }
  }
}
