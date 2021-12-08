
public class Main {
    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);

        Node root = four;
        four.left = two;
        two.left = one;
        two.right = three;
        four.right = six;
        six.left = five;
        six.right = seven;

        System.out.println(Node.str(root));
        System.out.println(Node.isBST(root));
    }
}
