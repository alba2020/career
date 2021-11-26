public class Main {
    public static void print(Node start) {
        Node n = start;
        while(n != null) {
            System.out.printf("%d ", n.data);
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.appendToTail(2);
        head1.appendToTail(3);
        head1.appendToTail(4);
        head1.appendToTail(5);

        print(head1);
    }
}
