public class Node {
    public int key;
    public Node left;
    public Node right;

    public Node(int key) {
        this.key = key;
    }

    public Node(int key, Node left, Node right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }

    public static String str(Node node) {
        if (node == null) return "";

        if (node.left == null && node.right == null) {
            return "" + node.key;
        }

        return "(" + str(node.left) + "<-" +
                node.key + "->" +
                str(node.right) + ")";
    }

    public static Node fromArray(int[] a, int i, int j) {
        if (i > j) return null;
        int mid = (i + j) / 2;
        Node p = new Node(a[mid]);
        p.left = fromArray(a, i, mid - 1);
        p.right = fromArray(a, mid + 1, j);
        return p;
    }
}
