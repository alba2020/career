public class Main {

    public static Node loop(Node head) {
        return null;
    }

    public static void main(String[] args) {
        Node list1 = new Node(1).append(2).append(3);
        Node four = new Node(4);
        list1.appendNode(four);

        Node list2 = new Node(2);
        list2.appendNode(four);

        list1.append(7);
        list1.append(8);
        list1.append(9);

        list1.print();
        list2.print();
    }
}
