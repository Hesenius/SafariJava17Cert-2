package switches;

public class Ex {
  public static void main(String[] args) {
    String s = "Hello";
    switch (s) {
//      case "Hello" -> {
//        System.out.print("Bonjour "); // line n1
//        System.out.print("Guten Tag ");
//      }
//      case "Goodbye" -> {
//        int x = (int)Math.random();
//      }

      case "Hello" ->
//        System.out.print("Bonjour "); // line n1
        System.out.print("Guten Tag ");
      default -> System.out.print("Bye");
    }

    switch(s) {
//      case "Hello":
//      case "Goodbye":
      case "Hello", "Goodbye":
        int x = 99;
//        break;
      default:
        x = 100;
        System.out.println(x);
    }
  }
}
