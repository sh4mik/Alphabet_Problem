import java.util.List;

public class Writer {
  public static void print(List<Character> wordsInOrder, boolean loopWasFound) {
    if (!loopWasFound) {
      for (var v: wordsInOrder) {
        System.out.print(v + " ");
      }
    } else {
      System.out.print("Impossible");
    }
  }
}
