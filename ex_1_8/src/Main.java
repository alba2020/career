import java.util.HashSet;

public class Main {
    public static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%2d ", a[i][j]);
            }
            System.out.println();
        }
    }

    public static void zero(int[][] a) {
        HashSet<Integer> zi = new HashSet<>();
        HashSet<Integer> zj = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 0) {
                    zi.add(i);
                    zj.add(j);
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (zi.contains(i) || zj.contains(j)) {
                    a[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 0}};
        print(matrix);
        System.out.println("---");
        zero(matrix);
        print(matrix);
    }
}
