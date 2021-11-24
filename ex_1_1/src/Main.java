import java.util.Hashtable;

public class Main {
    public static boolean hasDup(String s) {
        Hashtable<Character, Boolean> h = new Hashtable<>();
        for (char c : s.toCharArray()) {
            boolean exists = h.get(c);
            if ( exists ) {
                return true;
            }
            h.put(c, true);
        }
        return false;
    }

    public static boolean hasDup2(String s) {
        int total = 'z', prev = 'y';
        for (char c : s.toCharArray()) {
            prev = total;
            total = total ^ c;
            if (total - prev == c) {
                System.out.printf("dup: total - prev = %d %c\n", total-prev, total-prev);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "hello";

        System.out.println(hasDup2(s) ? "DUP" : "NO DUP");
    }
}
