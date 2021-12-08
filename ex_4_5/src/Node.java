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

    private static class Data {
        int min;
        int max;
        boolean isBST;

        public Data(int min, int max, boolean isBST) {
            this.min = min;
            this.max = max;
            this.isBST = isBST;
        }
    }

    public static boolean isBST(Node node) {
        return _isBST(node).isBST;
    }

    private static Data _isBST(Node node) {
        if (node.left != null) {
            Data leftData = _isBST(node.left);
            if (!leftData.isBST || leftData.max >= node.key) {
                return new Data(0, 0, false);
            }
        }
        if (node.right != null) {
            Data rightData = _isBST(node.right);
            if (!rightData.isBST || rightData.min < node.key) {
                return new Data(0, 0, false);
            }
        }
        return new Data(
                node.left != null ? node.left.key : node.key,
                node.right != null ? node.right.key : node.key,
                true);
    }
}
