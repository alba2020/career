import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static boolean isPermutation(String s1, String s2) {
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        String res1 = new String(a1);
        String res2 = new String(a2);

        return res1.equals(res2);
    }

    public static void main(String[] args) {
        System.out.println("is permutation? " + isPermutation("hello", "hello"));
        System.out.println("is permutation? " + isPermutation("abc", "cab"));
        System.out.println("is permutation? " + isPermutation("abc", "cab1"));
    }
}
