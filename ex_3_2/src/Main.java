public class Main {
    private static class MinStack<T extends Comparable<T>> {
        private MyStack<T> main;
        private MyStack<T> min;

        public MinStack() {
            this.main = new MyStack<>();
            this.min = new MyStack<>();
        }

        public T pop() {
            T top = main.pop();
            if (min.peek() == top) {
                min.pop();
            }
            return top;
        }

        public void push(T item) {
            if (min.isEmpty() || item.compareTo(min.peek()) < 0) {
                min.push(item);
            }
            main.push(item);
        }

        public T peek() {
            return main.peek();
        }

        public boolean isEmpty() {
            return main.isEmpty();
        }

        public T min() {
            return min.peek();
        }
    }

    public static void main(String[] args) {
        MinStack<Integer> stack = new MinStack<>();
        stack.push(5);
        stack.push(6);
        System.out.println(stack.min());
        stack.push(3);
        stack.push(1);
        System.out.println(stack.min());
        stack.push(2);
        stack.pop(); // 2
        stack.pop(); // 1
        stack.pop(); // 3
        System.out.println(stack.min());
        stack.pop(); // 6
        System.out.println(stack.min());
    }
}
