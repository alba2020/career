public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("no input");
            return;
        }

        Graph g = Graph.fromFile(args[0]);

        if (args.length == 1) {
            System.out.println(g);
            return;
        }

        int start = Integer.parseInt(args[1]);
        DFS search = new DFS(g, start);

        for (int v = 0; v < g.V(); v++)
            if (search.marked(v))
                System.out.print(v + " ");
        System.out.println();

        if (search.count() != g.V())
            System.out.print("NOT ");
        System.out.println("connected");
    }
}
