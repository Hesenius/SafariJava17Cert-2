package overloadresolution;

public class Example {
//  void doStuff(int x, int y) {}         // Method A
//  void doStuff(int x, long y) {}        // Method B
//  void doStuff(long x, int y) {}        // Method C
  void doStuff(int ... x) {}            // Method D
//  void doStuff(int y, int ... x) {}            // Method D
//  void doStuff(Integer x, Integer y) {} // Method E
//  void doStuff(Number x, Integer y) {} // Method E
//  void doStuff(Integer x, Number y) {} // Method E
//  void doStuff(Long x, Long y) {} // Method E

//  Given all five methods exist, which is invoked by the invocation
  public void doStuff() {
    doStuff(1, 2);
  }
}
