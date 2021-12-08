public class Node {
    public int key;
    public Node parent;
    public Node left;
    public Node right;

    public Node(int key) {
        this.key = key;
    }

    public void addLeft(Node other) {
        this.left = other;
        other.parent = this;
    }

    public void addRight(Node other) {
        this.right = other;
        other.parent = this;
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

    public Node next() {
        Node node = this;
        if (node.right != null) {
            node = node.right;
            while(node.left != null)
                node = node.left;
        } else {
            while(node.parent != null && node.key > node.parent.key)
                node = node.parent;
            node = node.parent;
        }
        return node;
    }
}
