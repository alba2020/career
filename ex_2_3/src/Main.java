// Реализуйте алгоритм, удаляющий узел из середины односвязного списка
// (то есть узла, не являющегося ни начальным, ни конечным — не обязательно
// находящегося точно в середине).
// Доступ предоставляется только к этому узлу.
// Пример:
// Ввод: узел c из списка a->b->c->d->e->f
// Вывод: ничего не возвращается, но новый список имеет вид: a->b->d->e->f

// 72. Представьте список 1->5->9->12. После удаления элемента 9 он принимает вид 1->5->12.
// Доступен только узел 9. Сможете ли вы прийти к правильному ответу?

public class Main {
    public static void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);

        head1.appendNode(new Node(2));
        Node three = new Node(3);
        head1.appendNode(three);
        head1.appendNode(new Node(4));
        head1.appendNode(new Node(5));
        head1.printList();

        deleteNode(three);
        head1.printList();
    }
}
