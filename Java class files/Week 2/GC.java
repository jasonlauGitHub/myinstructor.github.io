// Garbage collection (about the object's lifecycle)

// Garbage collection refers to the process of automatically freeing memory
// o the heap (of objects) by deleting objects that are no longer reachable in
// your program

// System.gc(). It is not guarenteed. Java is free to ignore that request

public class GC {
  public static void main(String[] args) {
    // References
    String str1 = new String("Object one");
    String str2 = new String("Object two");
    String str3 = new String("Object three");

    String str4 = str3;

    str1 = null;
    str2 = str3;
    // Both "Object one" and "Object two" became unreachable, and eligible for
    // garbage collection
  }
}
