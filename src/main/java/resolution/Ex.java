package resolution;

class Thang {
  static int x = 99;

}
class Thing extends Thang {
//  int x = 99;
  class IT {
//    int x = 100;
    public void doStuff() {
//      int x = 99;
      System.out.println(/*Thing.this.*/Thang.x);
    }
  }

//  static void showIt(Thing t) {
////    int x = 98;
//    System.out.println("x is " + t.x);
//  }
 /* static*/ void showIt() {
//    int x = 98;
    System.out.println("x is " + x);
  }
}
public class Ex {

}
