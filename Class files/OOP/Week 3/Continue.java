// Continue statement

/*
 * 'continue' is a statement that causes the flow to stop the execution
 * of the current iteration and go on to the next, preventing any other
 * instruction from being executed
 */

public class FlowControl {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5, 6};

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 2)
        continue; // Interrupts the flow... and continue the iterations
        System.out.println(nums[i]);
    }
  }
}
