package src;

public class Main {
    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);

        three.left = two;
        two.left = one;
        three.right = five;
        five.left = four;
        five.right = six;

        System.out.println(Node.str(three));

        // todo Node.next
    }
}
