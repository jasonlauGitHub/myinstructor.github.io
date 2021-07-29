// Parsing numbers

public class Binary {
  public static void main(String[] args) {
    // 101010
    // 1 1 1 1 (base 2)
    // 8 4 2 1
    // 8 bits (11111111) 0 - 255
    // 128  64  32  16  8  4  2  1 = 256 (0 - 255)

    System.out.println(Integer.toBinaryString(5));
    System.out.println(Integer.toBinaryString(15));
    System.out.println(Integer.toBinaryString(255));

    System.out.println(Integer.parseInt("101", 2));
    System.out.println(Integer.parseInt("1111", 2));
    System.out.println(Integer.parseInt("11111111", 2));
  }
}
