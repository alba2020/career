public class Main {
    public static void main(String[] args) {
        MyQueue<String> q = new MyQueue<>();
        q.enqueue("one");
        q.enqueue("two");
        q.enqueue("three");
        System.out.println(q.dequeue());
        q.enqueue("four");
        q.enqueue("five");
        System.out.println(q.dequeue());
        q.enqueue("six");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
