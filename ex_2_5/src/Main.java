public class Main {

    public static int listToNumber(Node head) {
        Node node = head;
        int n = 1;
        int total = 0;
        while (node != null) {
            total += node.data * n;
            n *= 10;
            node = node.next;
        }
        return total;
    }

    public static int listToNumberF(Node head) {
        Node node = head;
        int total = 0;
        while (node != null) {
            total *= 10;
            total += node.data;
            node = node.next;
        }
        return total;
    }

    public static Node numberToList(int x) {
        int d = 0;
        Node head = null;
        Node tail = null;
        while (x > 0) {
            d = x % 10;
            x /= 10;
            if (head == null) {
                head = new Node(d);
                tail = head;
            } else {
                tail.next = new Node(d);
                tail = tail.next;
            }
        }
        return head;
    }

    public static Node numberToListF(int x) {
        int d = 0;
        Node node = null;
        Node prev = null;
        while (x > 0) {
            d = x % 10;
            x /= 10;
            node = new Node(d);
            node.next = prev;
            prev = node;
        }
        return node;
    }

    public static void main(String[] args) {
        Node head1 = new Node(7).append(1).append(6);
        head1.printList();

        Node head2 = new Node(5).append(9).append(2);
        head2.printList();

        int n = listToNumber(head1) + listToNumber(head2);
        Node head3 = numberToList(n);
        head3.printList();

        System.out.println("---");

        head1 = new Node(6).append(1).append(7);
        head1.printList();

        head2 = new Node(2).append(9).append(5);
        head2.printList();

        n = listToNumberF(head1) + listToNumberF(head2);
        head3 = numberToListF(n);
        head3.printList();
    }
}
