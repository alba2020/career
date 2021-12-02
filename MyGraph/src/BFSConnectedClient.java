public class BFSConnectedClient {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("no input");
            return;
        }

        Graph g = Graph.fromFile(args[0]);
        OrientedGraph og = OrientedGraph.fromFile(args[0]);

        if (args.length == 1) {
            System.out.println(g);
            return;
        }

        int start = Integer.parseInt(args[1]);
        int target = Integer.parseInt(args[2]);

        System.out.println("not oriented");
        if (BFSConnected.isConnected(g, start, target)) {
            System.out.println(start + " is connected to " + target);
        } else {
            System.out.println(start + " is NOT connected to " + target);
        }

        System.out.println("oriented");
        if (BFSConnected.isConnected(og, start, target)) {
            System.out.println(start + " is connected to " + target);
        } else {
            System.out.println(start + " is NOT connected to " + target);
        }
    }
}
