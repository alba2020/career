package src;

public class Main {
    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);

        one.left = two;
        one.right = three;
        three.left = five;
        three.right = four;
//        four.right = six;

//        System.out.println(Node.str(one));
        System.out.println(one.isBalanced());
    }
}
