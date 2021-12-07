package src;

import java.util.LinkedList;

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

    public static LinkedList<LinkedList<Node>> levels(Node root) {
        LinkedList<LinkedList<Node>> top = new LinkedList<>();
        return _levels(top, 0, root);
    }

    private static LinkedList<LinkedList<Node>> _levels(
            LinkedList<LinkedList<Node>> top,
            int depth,
            Node node
    ) {
        if (node == null) return null;

        if (top.size() < depth + 1)
            top.add(new LinkedList<Node>());

        _levels(top, depth + 1, node.left);
        top.get(depth).add(node);
        _levels(top, depth + 1, node.right);
        return top;
    }
}
