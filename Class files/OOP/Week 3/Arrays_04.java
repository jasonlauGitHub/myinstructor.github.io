// Enhanced for (aka for-each) - no index (i)

public class Arrays_04 {
  public static void main(String[] args) {
    String[] beatles = new String[4];
    beatles[0] = "John";
    beatles[1] = "Paul";
    beatles[2] = "George";
    beatles[3] = "Ringo";

    for (String member : beatles)
      System.out.println(member);
  }
}
