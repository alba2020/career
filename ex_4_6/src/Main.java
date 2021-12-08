// Напишите алгоритм поиска «следующего» узла для заданного узла в бинарном дереве поиска.
// Считайте, что у каждого узла есть ссылка на его родителя.

public class Main {
    public static void main(String[] args) {
        Node[] nodes = new Node[16];
        for (int i = 1; i <= 15; i++)
            nodes[i] = new Node(i);

        nodes[8].addLeft(nodes[4]);
        nodes[4].addLeft(nodes[2]);
        nodes[2].addLeft(nodes[1]);
        nodes[2].addRight(nodes[3]);
        nodes[4].addRight(nodes[6]);
        nodes[6].addLeft(nodes[5]);
        nodes[6].addRight(nodes[7]);

        nodes[8].addRight(nodes[12]);
        nodes[12].addLeft(nodes[10]);
        nodes[10].addLeft(nodes[9]);
        nodes[10].addRight(nodes[11]);
        nodes[12].addRight(nodes[14]);
        nodes[14].addLeft(nodes[13]);
        nodes[14].addRight(nodes[15]);

//        System.out.println(Node.str(nodes[8]));

        System.out.println(nodes[2].next().key);
        System.out.println(nodes[4].next().key);
        System.out.println(nodes[7].next().key);
        System.out.println(nodes[9].next().key);
        System.out.println(nodes[11].next().key);
        System.out.println(nodes[15].next().key);
    }
}
