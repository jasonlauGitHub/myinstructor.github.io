// The switch-case statement

public class Switch_02 {
  public static void main(String[] args) {
    int num = 0;

    switch(num) {
      case 1:
        System.out.println("One");
        break;
      case 2:
        System.out.println("Two");
        break;
      case 3:
        System.out.println("Three");
        break;
      default:
        System.out.println("Something else");
        // We don't need 'break' here - it is the last branch
    }
  }
}
