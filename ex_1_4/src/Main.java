import java.util.Hashtable;
import java.util.Set;

public class Main {
    public static boolean isPalPerm(String s) {
        Hashtable<Character, Integer> h = hashFromString(s);
        int odd = 0;
        Set<Character> keys = h.keySet();
        for (Character k : keys) {
            if (h.get(k) % 2 != 0) {
                odd++;
            }
            if (odd > 1) {
                return false;
            }
        }
        return true;
    }

    public static Hashtable<Character, Integer> hashFromString(String s) {
        Hashtable<Character, Integer> h = new Hashtable<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (h.containsKey(c)) {
                h.put(c, h.get(c) + 1);
            } else {
                h.put(c, 1);
            }
        }
        return h;
    }

    public static void main(String[] args) {
        System.out.println(isPalPerm("Hello"));
        System.out.println(isPalPerm("hello hello"));
        System.out.println(isPalPerm("abccba"));
    }
}
