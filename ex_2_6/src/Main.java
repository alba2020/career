import java.util.Stack;

public class Main {
    static class Data {
        boolean result;
        Node left;
    }

    static class XList {
        Node first;
        Node last;

        public XList(Node first, Node last) {
            this.first = first;
            this.last = last;
        }
    }

    public static int listLength(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + listLength(node.next);
    }

    public static XList reverseCopy(Node node) {
        if (node.next == null) {
            Node n = new Node(node.data);
            return new XList(n, n);
        }

        XList xlist = reverseCopy(node.next);

        Node newNode = new Node(node.data);
        xlist.last.next = newNode;
        xlist.last = newNode;

        return xlist;
    }

    public static Data foo(Node first, Node cur) {
        Data ret = new Data();
        if (cur.next == null) {
            ret.result = first.data == cur.data;
            ret.left = first.next;
        } else {
            Data d = foo(first, cur.next);
            ret.result = d.result && (d.left.data == cur.data);
            ret.left = d.left.next;
        }
        return ret;
    }

    boolean isPalindrome(Node head) {
        Node fast = head;
        Node slow = head;

        Stack<Integer> stack = new Stack<Integer>();
        /* Элементы первой половины связного списка помещаются в стек. Когда
         * быстрый указатель (со скоростью 2x) достигает конца связного списка,
         * медленный находится в середине */
        while (fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        /* Нечетное количество элементов, средний элемент пропускается */
        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            int top = stack.pop();

            /* Если значения не совпадают, это не палиндром */
            if (top != slow.data) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node('a')
                .append('b')
                .append('c')
                .append('d')
                .append('e');

//        head.printList();
//        System.out.println("length=" + listLength(head));
//        Data d = foo(head, head);
//        System.out.println("res " + d.result);
        XList copy = reverseCopy(head);
        copy.first.printList();
    }
}
