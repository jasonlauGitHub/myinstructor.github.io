// Celsius to Fahrenheit (with a static method)

public class StaticMethods {
  // Method with argument
  public static double toFahrenheit(double celsius) {
    double result = celsius * 1.8 + 32;
    return result;
  }

  public static void main(String[] args) {
    // Convert c = new Convert();
    // An object (instance) in not required here
    System.out.println(String.format("%.2f", toFahrenheit(10)));

  }
}
