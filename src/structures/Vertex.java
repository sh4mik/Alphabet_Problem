package structures;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
  public Vertex(char ch){
    color = Color.WHITE;
    edges = new ArrayList<>();
    this.value = ch;
  }

  public Color color;
  public List<Integer> edges;
  public char value;
}