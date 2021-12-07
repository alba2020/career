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

    // bug
    public static boolean isBST(Node node) {
        if (node.left != null) {
            if (!isBST(node.left) || node.left.key >= node.key) {
                return false;
            }
        }
        if (node.right != null) {
            if (!isBST(node.right) || node.right.key < node.key) {
                return false;
            }
        }
        return true;
    }
}
