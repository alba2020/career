import java.util.LinkedList;

public class AnimalQueue {

    protected final LinkedList<Animal> list;

    public AnimalQueue() {
        this.list = new LinkedList<>();
    }

    public void enqueue(Animal a) {
        list.addFirst(a);
    }

    public Animal dequeue() {
        return list.removeLast();
    }

    public Animal peek() {
        return list.peekLast();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
