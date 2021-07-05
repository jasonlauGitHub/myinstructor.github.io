// Chaining methods

public class Chain {
  public static void main(String[] args) {
    String str1 = " anDRE ";
    String str2 = "Love Java, my friend";

    // Chaining built-in methods (Java methods)
    String result = str1.trim().toLowerCase().replace('a', 'A');
    System.out.println(result);

    String language = str2.substring(str2.indexOf('J'), str2.indexOf(','));
    System.out.println(language);
  }
}
