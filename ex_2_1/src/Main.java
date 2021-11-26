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

    public static void removeDupsHash(Node n) {
        HashSet<Integer> h = new HashSet<Integer>();
        Node prev = null;
        while (n != null) {
            if (h.contains(n.data)) {
                prev.next = n.next;
            } else {
                h.add(n.data);
                prev = n;
            }
            n = n.next;
        }
    }

    public static void removeDupsSlow(Node head) {
        Node n = head;
        while (n != null) {
            while (n.next != null && listContains(n.next.data, head, n.next)) {
                n.next = n.next.next;
            }
            n = n.next;
        }
    }

    public static boolean listContains(int val, Node from, Node to) {
        for (Node n = from; n != null && n != to; n = n.next) {
            if (n.data == val) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.appendToTail(2);
        head1.appendToTail(3);
        head1.appendToTail(2);
        head1.appendToTail(1);
        head1.appendToTail(5);

        print(head1);
        removeDupsHash(head1);
        print(head1);
    }
}
