import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class DFSPaths {

    private boolean[] marked;
    private int edgeTo[];
    private final int start;

    public DFSPaths(Graph graph, int start) {
        marked = new boolean[graph.V()];
        edgeTo = new int[graph.V()];
        this.start = start;
        dfs(graph, start);
    }

    private void dfs(Graph graph, int v) {
        marked[v] = true;
        for (int w : graph.adj(v)) {
            if (! marked[w]) {
                edgeTo[w] = v;
                dfs(graph, w);
            }
        }
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

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
