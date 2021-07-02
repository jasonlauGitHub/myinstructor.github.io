// Celsius to Fahrenheit

public class Convert {
  // Method with argument
  public double toFahrenheit(double celsius) {
    double result = celsius * 1.8 + 32;
    return result;
  }

  public static void main(String[] args) {
    Convert c = new Convert();

    // double fahrenheit = c.toFahrenheit(12);
    // System.out.println(fahrenheit);
    // System.out.println(c.toFahrenheit(32.8));
    System.out.println(String.format("%.2f", c.toFahrenheit(35.9)));

  }
}
