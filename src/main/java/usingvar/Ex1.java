package usingvar;

class X {
  // var is NOT for fields
//  var x = 99;
}

public class Ex1 {

  public static void main(String[] args) {
    final long y = 3_000_000_000L;
//    char x = y;
  }
//    void doStuff(var x) { }

//    void doStuff() {
//      var x;
//      x = 100;
//    }

//    void doStuff() {
//      var x = 100;
////      x = "Hello";
//    }

    void doStuff() {
//      int[] x = { 1, 2, 3 };
//      var x = new int[]{ 1, 2, 3 };
//      var x = { 1, 2, 3 }; // NOPE double-inferencing

      // var declares & initializes ONE variable only!!!
//      var x = 99, y = 2, z[] = {};

      var var = 3;
    }

}

//class var {}
