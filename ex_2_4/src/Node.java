class Node {
    Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }

    Node append(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;

        return this;
    }

    Node appendNode(Node newNode) {
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = newNode;
        return this;
    }

    public void printList() {
        Node n = this;
        while (n != null) {
            System.out.printf("%d ", n.data);
            n = n.next;
        }
        System.out.println();
    }
}
