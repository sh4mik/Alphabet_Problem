import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import structures.Color;
import structures.Vertex;

public class TopSort {

  private boolean loopWasFound = false;
  private List<Character> wordsInOrder = new ArrayList<>();

  private Vertex[] V;

  public TopSort(Vertex[] v) {
    V = v;
  }

  public List<Character> getWordsInOrder() {
    return wordsInOrder;
  }

  public boolean isLoopFound() {
    return loopWasFound;
  }

  private void DFS(Vertex v) {
    if (loopWasFound) {
      return;
    }
    if (v.color == Color.WHITE) {
      v.color = Color.GRAY;
      for (var e : v.edges) {
        DFS(V[e]);
      }
      v.color = Color.BLACK;
      wordsInOrder.add(v.value);
    } else if (v.color == Color.GRAY) {
      loopWasFound = true;
    }
  }

  public List<Character> topSort() {
    for (var v: V) {
      DFS(v);
    }
    Collections.reverse(wordsInOrder);
    return wordsInOrder;
  }
}
