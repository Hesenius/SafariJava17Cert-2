package textblocks;

public class Ex1 {
  public static void main(String[] args) {

    String message = """
       Hello\
       Java 17 World!""";
    System.out.println(message + "XXX");

    String message2 = """
        Hello
            Java 17 World!""";
    System.out.println(message2 + "XXX");
  }
}
