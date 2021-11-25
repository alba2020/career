import java.util.HashSet;

public class Main {
    public static void print(Node start) {
        Node n = start;
        while(n != null) {
            System.out.printf("%d ", n.data);
            n = n.next;
        }
        System.out.println();
    }

    public static Node removeDups(Node head) {
        Node n = head;
        HashSet<Integer> h = new HashSet<>();
        h.add(n.data);
        while (n.next != null) {
            if (h.contains(n.next.data)) {
                n.next = n.next.next;
            } else {
                h.add(n.next.data);
            }
            n = n.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.appendToTail(2);
        head1.appendToTail(3);
        head1.appendToTail(2);
        head1.appendToTail(2);
        print(head1);

        removeDups(head1);
        print(head1);
    }
}
