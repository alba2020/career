public class Main {
    public static void main(String[] args) {
        SetOfStacks<Integer> s = new SetOfStacks<>(2);
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
