// В приюте для животных есть только собаки и кошки,
// а работа осуществляется в порядке очереди.
// Люди должны каждый раз забирать «самое старое»
// (по времени пребывания в питомнике) животное, но могут
// выбрать кошку или собаку (животное в любом случае будет
// «самым старым»).
// Нельзя выбрать любое понравившееся животное.
// Создайте структуру данных, которая обеспечивает
// функционирование этой системы и реализует операции
// enqueue, dequeueAny, dequeueDog и dequeueCat.
// Разрешается использование встроенной структуры данных
// LinkedList.

public class Main {
    public static void main(String[] args) {
        SelectAnimalQueue q = new SelectAnimalQueue();

        q.enqueue(new Cat("cat1"));
        q.enqueue(new Cat("cat2"));
        q.enqueue(new Cat("cat3"));
        q.enqueue(new Dog("dog4"));
        q.enqueue(new Dog("dog5"));
        q.enqueue(new Dog("dog6"));

        System.out.println(q.dequeueCat());
        System.out.println(q.dequeueDog());
        System.out.println(q.dequeueAny());
        System.out.println(q.dequeueCat());
        System.out.println(q.dequeueDog());
        System.out.println(q.dequeueAny());
    }
}
