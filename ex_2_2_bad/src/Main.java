public class Main {
    public static void print(Node start) {
        Node n = start;
        while (n != null) {
            System.out.printf("%d ", n.data);
            n = n.next;
        }
        System.out.println();
    }

    static int listLength;

    public static Node[] createTable(Node first) {
        Node cur  = first;
        int index = 0;

        Node[] table = new Node[4]; // 2
        int step = 2;
        int pos = 0;

        while (cur != null) {
            if ( (index + 1) % step == 0) {
                pos = index / step;

                if (pos == table.length) {
                    table = increaseTable(table);
                    step *= 2;
//                    System.out.println("-- inc ---");
                    continue;
                }
//                System.out.printf("write. index = %d pos = %d val = %d\n", index, pos, cur.data);
                table[pos] = cur;

                printTable(table);
            }
            cur = cur.next;
            index++;
        }
        listLength = index;
        return table;
    }

    public static Node[] increaseTable(Node[] table) {
        Node[] newTable = new Node[table.length * 2];
        for (int i = 1; i < table.length; i+=2) {
            newTable[i / 2] = table[i];
        }
//        System.out.printf("created new table\n");
//        printTable(newTable);
        return newTable;
    }

    public static Node findKFromTheEnd(int k, Node first, Node[] table) {
        int pos = listLength - k;
//        System.out.println("list length " + listLength);
//        System.out.println("pos " + pos);

        int offset = (listLength - k) / table[0].data - 1;
//        System.out.println("offset " + offset);
        Node node = table[offset];
        for (int i = 0; i + table[offset].data < pos; i++) {
            node = node.next;
        }
        return node;
    }

    public static void printTable(Node[] table) {
        for (Node node : table) {
            if (node == null) {
                break;
            }
            System.out.printf("%d ", node.data);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        for (int i = 2; i < 45; i++) {
            head1.append(i);
        }

        print(head1);
        Node []table = createTable(head1);
        System.out.println();
        System.out.println("table");
        printTable(table);

        Node found = findKFromTheEnd(1, head1, table);
        System.out.println("found " + found.data);

        found = findKFromTheEnd(3, head1, table);
        System.out.println("found " + found.data);

        found = findKFromTheEnd(5, head1, table);
        System.out.println("found " + found.data);

        found = findKFromTheEnd(15, head1, table);
        System.out.println("found " + found.data);
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
