package src;

public class Node {
    public int key;
    public Node left;
    public Node right;

    public Node(int key) {
        this.key = key;
    }

    public static String str(Node node) {
        if (node == null) return "";

        if (node.left == null && node.right == null) {
            return "" + node.key;
        }

        return "(" + str(node.left) + " <- " +
                node.key + " -> " +
                str(node.right) + ")";
    }

    public static Node next(Node node) {
        return node;
    }
}
