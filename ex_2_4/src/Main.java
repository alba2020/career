public class Main {
    public static Node split(Node start, int value) {
        Node node = start;
        Node prev = null;
        Node newHead = start;

        while (node != null) {
            if (node.data < value && prev != null) {
//                System.out.printf("%d < %d\n", node.data, value);
                prev.next = node.next;
//                System.out.println("prev value " + prev.data);
                Node savedNext = node.next;
                node.next = newHead;
//                System.out.println("now next value is " + node.next.data);
                newHead = node;
//                System.out.println("new head value is " + newHead.data);
                node = savedNext;
            } else {
                prev = node;
                node = node.next;
            }
        }
        return newHead;
    }

    public static Node partition(Node node, int x) {
        Node head = node;
        Node tail = node;

        while (node != null) {
            Node next = node.next;
            if (node.data < x) {
                /* Вставить узел в начало. */
                node.next = head;
                head = node;
            } else {
                /* Вставить узел в конец. */
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null;

        // Начало изменилось, возвращаем его пользователю.
        return head;
    }

    public static void main(String[] args) {
        Node head1 = new Node(3);
        head1.append(5).append(8).append(5).append(10).append(2).append(1);
        head1.printList();

        head1 = partition(head1, 5);
        head1.printList();
    }
}
