import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class BFSPaths {
    private boolean[] marked;
    private int edgeTo[];
    private final int start;

    public BFSPaths(Graph graph, int start) {
        marked = new boolean[graph.V()];
        edgeTo = new int[graph.V()];
        this.start = start;
        bfs(graph, start);
    }

    private void bfs(Graph graph, int start) {
        Queue<Integer> queue = new ArrayDeque<>();
        marked[start] = true;
        queue.add(start);
        while(!queue.isEmpty()) {
            int v = queue.remove();
            for (int w : graph.adj(v)) {
                if (!marked[w]) {
                    edgeTo[w] = v;
                    marked[w] = true;
                    queue.add(w);
                }
            }
        }
    }

    public boolean hasPathTo(int v) { return marked[v]; }

    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v)) return null;
//        Stack<Integer> path = new Stack<>(); // reverse order
        Deque<Integer> path = new ArrayDeque<>();
        for (int x = v; x != start; x = edgeTo[x])
            path.push(x);
        path.push(start);
        return path;
    }
}
