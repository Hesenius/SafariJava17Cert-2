package stringinterning;

public class Example {
  static String greet = "Hello";
  public static void main(String[] args) {
    String s1 = "Hello";


    String s2 = "He";
    // creates a new string even though we know it's a duplicate!!
    s2 = s2 + "llo";
    System.out.println(s2);
    System.out.println("Hello" == s2);
    System.out.println("Hello" == s1);
    // If you will have lots of duplicates, then there is benefit
    // to pooling identical values as a single object
    // do this with "intern()"
    // if s2 finds a match (equals) in the constant pool,
    // intern returns that pooled object
    String s3 = s2.intern();
    System.out.println("Hello" == s3);

    String x1 = "He";
    x1 = x1 + "llo World!";
    String x2 = x1.intern();
    System.out.println("x1 == x2? " + (x1 == x2));
  }
}
