public class SetOfStacks<T> {

    MyStack<MyStack<T>> ss;
    int max;
    int n = 0;

    public SetOfStacks(int max) {
        ss = new MyStack<>();
        this.max = max;
    }

    public void push(T item) {
        if (n % max == 0) {
            ss.push(new MyStack<>());
        }
        ss.peek().push(item);
        n++;
    }

    public T pop() {
        T item = ss.peek().pop();
        n--;
        if (n % max == 0) {
            ss.pop();
        }
        return item;
    }
}
