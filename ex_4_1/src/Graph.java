import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

enum State {Unvisited, Visited, Visiting;}

class Node {
    public String name;
    public Node[] children;
    public State state = State.Unvisited;

    public Node(String name) {
        this.name = name;
    }

    public Node[] getAdjacent() {
        return children;
    }
}

class Graph {
    public Node[] nodes;

    public Node[] getNodes() {
        return nodes;
    }

    // ???
    void search(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        HashSet<Node> visited = new HashSet<>();

        visited.add(root);
        queue.add(root); // Добавление в конец очереди

        while (!queue.isEmpty()) {
            Node r = queue.remove(); // Удаление в начале очереди
            // if (r == end) return true;
            for (Node n : r.children) {
                if (!visited.contains(n)) {
                    visited.add(n);
                    queue.add(n);
                }
            }
        }
    }
}
