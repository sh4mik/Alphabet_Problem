import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import structures.Color;
import structures.Vertex;

public class Main {

  static void run() {
    TopSort x = new TopSort(Reader.read());
    x.topSort();
    Writer.print(x.getWordsInOrder(), x.isLoopFound());
  }

  public static void main(String[] args) {
    run();
  }
}