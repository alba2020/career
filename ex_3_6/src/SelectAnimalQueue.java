public class SelectAnimalQueue {

    AnimalQueue normal;
    AnimalQueue extra;

    public SelectAnimalQueue() {
        this.normal = new AnimalQueue();
        this.extra = new AnimalQueue();
    }

    public void enqueue(Animal a) {
        normal.enqueue(a);
    }

    public Animal dequeueAny() {
        return extra.isEmpty() ?
               normal.dequeue() :
               extra.dequeue();
    }

    public Dog dequeueDog() {
        if (extra.peek() instanceof Dog) {
            return (Dog) extra.dequeue();
        } else {
            while(!normal.isEmpty()) {
                Animal a = normal.dequeue();
                if (a instanceof Dog) {
                    return (Dog) a;
                } else {
                    extra.enqueue(a);
                }
            }
        }
        return null;
    }

    public Cat dequeueCat() {
        if (extra.peek() instanceof Cat)
            return (Cat) extra.dequeue();

        while(!normal.isEmpty()) {
            Animal a = normal.dequeue();
            if (a instanceof Cat)
                return (Cat) a;
            extra.enqueue(a);
        }
        return null;
    }
}
