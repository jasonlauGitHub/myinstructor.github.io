// The for statement (for loop)

/*
 *  for (initialization; booleanExpression; updateStatement) {
 *    expression;
 *  }
 */

public class For_01 {
  public static void main(String[] args) {
    // Length is 6 (0 - 5)
    int[] nums = {1, 2, 3, 4, 5, 6};

    // i (iterator) will the index (aka subscript)
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  }
}
