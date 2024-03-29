// Flow control (continue)

/*
 * 'continue' is a statement that causes the flow to stop the execution of the
 * current iteration and go on to the next, preventing any other instruction
 * from being executed
 */

public class Continue {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5, 6};
    int count = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        System.out.println(nums[i]);
        continue;
      }
    }
  }
}
