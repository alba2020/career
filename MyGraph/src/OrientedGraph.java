import java.io.File;
import java.util.Scanner;

public class OrientedGraph extends Graph {

    public OrientedGraph(int V) {
        super(V);
    }

    public OrientedGraph(Scanner in) {
        super(in);
    }

    public static OrientedGraph fromFile(String filename) {
        try {
            File file = new File(filename);
            Scanner in = new Scanner(file);
            return new OrientedGraph(in);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public void addEdge(int v, int w) {
        adj[v].add(w);
        E++;
    }
}
