public class DFS {

    private boolean[] marked;
    private int count;

    public DFS(Graph graph, int start) {
        marked = new boolean[graph.V()];
        dfs(graph, start);
    }

    private void dfs(Graph graph, int v) {
        marked[v] = true;
        count++;
        for (int w : graph.adj(v)) {
            if (! marked[w]) {
                dfs(graph, w);
            }
        }
    }

    public boolean marked(int w) { return marked[w]; }

    public int count() { return count; }
}
