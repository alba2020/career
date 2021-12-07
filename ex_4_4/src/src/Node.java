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

        return "(" + str(node.left) + "<-" +
                node.key + "->" +
                str(node.right) + ")";
    }

    private static class Data {
        int count;
        boolean balanced;
        public Data(int count, boolean balanced) {
            this.count = count;
            this.balanced = balanced;
        }
    }

    public boolean isBalanced() {
        return getData(this).balanced;
    }

    private static Data getData(Node node) {
        if (node == null) {
            return new Data(0, true);
        }

        Data leftData = getData(node.left);
        Data rightData = getData(node.right);
        if ((!leftData.balanced) || (!rightData.balanced)) {
            return new Data(0, false);
        }
        if ( Math.abs(leftData.count - rightData.count) > 1) {
            return new Data(0, false);
        }
        return new Data(
                Math.max(leftData.count, rightData.count) + 1,
                true
        );
    }
}
