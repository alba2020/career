package src;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10,11,12};

        Node root = Node.fromArray(a, 0, a.length - 1);

        System.out.println(Node.str(root));

        LinkedList<LinkedList<Node>> top =
                Node.levels(root);
        for(LinkedList<Node> level : top) {
            for (Node node : level) {
                System.out.print(node.key + " ");
            }
            System.out.println();
        }
    }
}
