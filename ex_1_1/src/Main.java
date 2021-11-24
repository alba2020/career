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
        long x = 0;
        for (char c : s.toCharArray()) {
            long mask = (long) Math.pow(2, c - 'a');
            if ((x & mask) != 0) {
                System.out.println("dup " + c);
                return true;
            }
            x |= mask;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyza";

        System.out.println(hasDup2(s) ? "DUP" : "NO DUP");
    }
}
