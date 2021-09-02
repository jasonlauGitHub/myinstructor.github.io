import java.util.*;

public class Population {
  public static void main(String[] args) {
    double organisms = 0.0, increase = 0.0, result = 0.0;
    int days = 0;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of organisms: ");
    organisms = input.nextDouble();

    System.out.print("Enter the average daily increase: ");
    increase = input.nextDouble();

    System.out.print("Enter the number of days: ");
    days = input.nextInt();

    if (organisms >= 2 && increase >= 1 && days >= 1) {
      for (int i = 0; i < days; i++) {
        if (i == 0) {
          System.out.println("Day 1: " + organisms);
        } else {
          result = organisms + (organisms * (increase / 100));
          System.out.println("Day " + (i + 1) + ": " + String.format("%.2f", result) + " organisms");
          organisms = result;
        }
      }
    } else {
      // Complete the code
    }

    System.out.println();

    input.close();
  }
}
