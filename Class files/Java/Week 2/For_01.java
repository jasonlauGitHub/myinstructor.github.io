// The for statement (for loop)

/*
 *  for (initialization; booleanExpression; updateStatement) {
 *    statement;
 *  }
 */

public class For_01 {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5, 6};

    // length contains the size of the array - it is not a method
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  }
}
