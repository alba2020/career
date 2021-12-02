import java.util.ArrayDeque;
import java.util.Queue;

public class BFSConnected {

    public static boolean isConnected(Graph graph, int start, int target) {
        boolean[] marked = new boolean[graph.V()];
        Queue<Integer> queue = new ArrayDeque<>();

        marked[start] = true;
        queue.add(start);

        while(!queue.isEmpty()) {
            int v = queue.remove();

            if (v == target) return true;

            for (int w : graph.adj(v)) {
                if (!marked[w]) {
                    marked[w] = true;
                    queue.add(w);
                }
            }
        }
        return false;
    }
}
