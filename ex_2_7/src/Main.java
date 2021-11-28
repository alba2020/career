public class Main {
    public static Node common(Node head1, Node head2) {
        int len1 = head1.len();
        int len2 = head2.len();

        if (len1 > len2) {
            for(int i = 0; i < len1-len2; i++) {
                head1 = head1.next;
            }
        } else if (len1 < len2) {
            for(int i = 0; i < len2-len1; i++) {
                head2 = head2.next;
            }
        }

        while(head1 != null && head2 != null) {
            if (head1 == head2) {
                return head1;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
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

        Node c = common(list1, list2);
        int d = (c != null) ? c.data : -1;
        System.out.println("common node " + d);
    }
}
