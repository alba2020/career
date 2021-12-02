import java.util.LinkedList;
import java.util.Queue;

public class Main {

    boolean search(Graph g, Node start, Node end) {
        if (start == end) return true;

        Queue<Node> q = new LinkedList<Node>();

        for (Node u : g.getNodes()) {
            u.state = State.Unvisited;
        }
        start.state = State.Visiting;
        q.add(start);
        Node u;
        while (!q.isEmpty()) {
            u = q.remove(); // то есть dequeue()
            if (u == end) return true;
            for (Node v : u.getAdjacent()) {
                if (v.state == State.Unvisited) {
                    v.state = State.Visiting;
                    q.add(v);
                }
            }
            u.state = State.Visited;
        }
        return false;
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        g.nodes = new Node[]{
                new Node("a1"),
                new Node("a2"),
                new Node("a3"),
        };
    }
}
