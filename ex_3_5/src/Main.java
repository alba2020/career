import java.util.Random;

// Напишите программу сортировки стека,
// в результате которой наименьший элемент
// оказывается на вершине стека. Вы можете использовать
// дополнительный временный стек, но элементы не должны
// копироваться в другие структуры данных
// (например, в массив). Стек должен поддерживать следующие
// операции: push, pop, peek, isEmpty.
public class Main {

    public static void main(String[] args) {
        MyStack<Integer> s = new MyStack<>();
        MyStack<Integer> t = new MyStack<>();

        Random rnd = new Random();
        for(int i = 0; i < 20; i++) {
            s.push(rnd.nextInt(100));
        }

        int item, prev, x;
        item = s.pop();
        t.push(item);
        prev = item;

        while(!s.isEmpty()) {
            item = s.pop();
            if (item < prev) {
                do {
                    x = t.pop();
                    s.push(x);
                } while (x > item && !t.isEmpty());
            }
            t.push(item);
            prev = item;
        }

        while(!t.isEmpty()) {
            s.push(t.pop());
        }
        while(!s.isEmpty()) {
            System.out.printf("%d ", s.pop());
        }
        System.out.println();
    }
}
