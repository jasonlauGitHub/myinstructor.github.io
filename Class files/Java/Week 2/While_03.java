// The do-while loop

public class While_03 {
  public static void main(String[] args) {
    boolean keepGoing = true;
    int result = 14;
    int i = 10;

    do {
      i--;
      if (i == 8)
        keepGoing = false;
        result = result - 2;
    } while (keepGoing);

    System.out.println(result);  // 10
  }
}
