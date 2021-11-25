import java.util.Arrays;

public class Main {
    public static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        return sorted(s1).equals(sorted(s2));
    }

    public static String sorted(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }

    public static void main(String[] args) {
        System.out.println("is permutation? " + isPermutation("hello", "hello"));
        System.out.println("is permutation? " + isPermutation("abc", "cab"));
        System.out.println("is permutation? " + isPermutation("abc", "cab1"));
    }
}
