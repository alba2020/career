class Node {
    Node next = null;
    int data;

    public Node(int d) { data = d; }

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

    public void print() {
        Node n = this;
        while (n != null) {
            System.out.printf("%s ", n.data);
            n = n.next;
        }
        System.out.println();
    }

    public int len() {
        Node n = this;
        int length = 0;
        while (n != null) {
            length++;
            n = n.next;
        }
        return length;
    }
}
