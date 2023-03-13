package casting;

//final class Base {
sealed class Base  permits Sub, Sub2 {
  void doBaseStuff() { System.out.println("doBaseStuff"); }
}

final class Sub extends Base {
  void doBaseStuff() { System.out.println("doSubStuff"); }
  void doOtherStuff() { System.out.println("doOtherStuff"); }
}
final class Sub2 extends Base {}

//class OddBall extends Sub implements Runnable {
//  @Override
//  public void run() {
//    System.out.println("ahahaha!");
//  }
//}

public class Ex {
  public static void main(String[] args) {
//    Base b = new Sub();
//    Base b = new OddBall();
//    b = "Hello";
    Base b = new Base();
//    b.doBaseStuff();
//    ((Sub)b).doOtherStuff();
    // assignment from String to Base is impossible, so
    // this cast could NEVER be valid and is rejected
//    ((String)b)

//    ((Runnable) b).run();
  }
}

