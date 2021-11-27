public class Main {
    public static void print(Node start) {
        Node n = start;
        while (n != null) {
            System.out.printf("%d ", n.data);
            n = n.next;
        }
        System.out.println();
    }

    public static Node findK(int k, Node start) {
        Node fast = start;
        Node slow = start;
        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        for (int i = 2; i < 15; i++) {
            head1.append(i);
        }
        print(head1);

        Node found = findK(1, head1);
        System.out.println(found != null ? found.data : "not found");

        found = findK(2, head1);
        System.out.println(found != null ? found.data : "not found");

        found = findK(125, head1);
        System.out.println(found != null ? found.data : "not found");
    }
}

// 8. А если размер связного списка известен?
// Чем поиск K-го элемента с конца отличается от поиска X-го элемента?

// 25. Если размер связного списка неизвестен, можно ли вычислить его?
// Как это отразится на времени выполнения?

// 41. Попробуйте применить рекурсивную реализацию.
// Если вы можете найти (K-1)-й элемент с конца, удастся ли вам найти K-й элемент?

// 67. В данном случае может быть полезно возвращать сразу несколько значений. В некоторых языках такая возможность не поддерживается напрямую, но обходные решения существуют в любом языке.
// Какие обходные решения такого рода вам известны?

// 126. Возможно ли итеративное решение? Представьте, что у вас имеются два указателя, установленные на соседние узлы, которые перемещаются с одинаковой скоростью по связному списку.
// Когда один указатель достигнет конца связного списка, где будет находиться другой?
