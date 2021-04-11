import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import structures.Vertex;

public class Reader {

  private static final int ALPHABET_SIZE = 26;

  public static Vertex[] read() {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    Vertex[] graph = List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
        'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z').stream()
        .map(Vertex::new)
        .toArray(Vertex[]::new);

    scanner.nextLine();
    String prev = scanner.nextLine();
    for (int i = 1; i < n; ++i) {
      String next = scanner.nextLine();
      for (int j = 0; j < Integer.min(prev.length(), next.length()); j++) {
        if (next.charAt(j) != prev.charAt(j)) {
          graph[prev.charAt(j) - 'a'].edges.add(next.charAt(j) - 'a');
          break;
        }
      }
      prev = next;
    }
    return graph;
  }
}
