package switches;

public class Expression {
  public static void main(String[] args) {
    short s = 8;
    System.out.println(switch (s) { // line n1
      // line n2
      case 1, 2, 3, 4, 5, 6, 7, 8, 9 -> {
        System.out.println("smallis number found");
        yield "It's 1 to 9";
      }
      default -> "It's something else";
//      case 8 -> "It's something else";
//      default -> throw new IllegalStateException();
    });

    System.out.println("-----------------------");

    String message = switch (s) {
      case 1,2,3,4,5,6,7,8,9:
        yield "1 to 9";
      default:
        yield "Something else";
    };
    System.out.println("Message is " + message);

  }
}
