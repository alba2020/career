public class Main {

    public static char[] reverseArray(char[] a, int from, int to) {
        for (int i = 0; i < (to - from) / 2; i++) {
            char t = a[from + i];
            a[from + i] = a[to - 1 - i];
            a[to - 1 - i] = t;
        }
        return a;
    }

    public static char[] shiftArray(char[] a, int p) {
        reverseArray(a, 0, p);
        reverseArray(a, p, a.length);
        reverseArray(a, 0, a.length);
        return a;
    }

    public static String allSubs(String s) {
        char[] a = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            shiftArray(a, 1);
            sb.append(a);
            sb.append("|");
        }
        return sb.toString();
    }

    public static boolean isSubstring(String s, String b) {
        return b.contains(s);
    }

    public static boolean check(String s2, String s1) {
        if (s1.length() != s2.length()) {
            return false;
        }
        return isSubstring(s2, allSubs(s1));
    }

    public static void main(String[] args) {
        String s1 = "world";
        String s2 = "rldwo";
        System.out.println(check(s2, s1));
    }
}