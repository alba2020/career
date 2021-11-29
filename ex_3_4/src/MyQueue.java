// Напишите класс MyQueue, который реализует
// очередь с использованием двух стеков.
public class MyQueue<T> {

    MyStack<T> read;
    MyStack<T> write;

    public MyQueue() {
        read = new MyStack<>();
        write = new MyStack<>();
    }

    public void enqueue(T item) {
        write.push(item);
    }

    public T dequeue() {
        if (read.isEmpty()) {
            copyReadToWrite();
        }
        return read.pop();
    }

    private void copyReadToWrite() {
        while (!write.isEmpty()) {
            read.push(write.pop());
        }
    }
}
