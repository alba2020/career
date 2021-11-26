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
}
