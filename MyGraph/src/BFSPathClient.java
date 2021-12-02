public class BFSPathClient {
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
        BFSPaths search = new BFSPaths(g, start);

        for (int v = 0; v < g.V(); v++) {
            if (search.hasPathTo(v)) {
                System.out.print(start + " to " + v + ": ");

                for (int x : search.pathTo(v)) {
                    if (x == start) System.out.print(x);
                    else System.out.print("-" + x);
                }

                System.out.println();
            }
        }
    }
}
