public class Main {
    public static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%2d ", a[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] rotate(int[][] a) {
        int n = a.length;
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[j][n - 1 - i] = a[i][j];
            }
        }
        return b;
    }

    public static void rotateMD(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                int t = a[j][i];
                a[j][i] = a[i][j];
                a[i][j] = t;
            }
        }
    }

    public static void flipH(int[][] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int t = a[i][n - 1 - j];
                a[i][n - 1 - j] = a[i][j];
                a[i][j] = t;
            }
        }
    }

    public static void rotateInPlace(int[][] a) {
        rotateMD(a);
        flipH(a);
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        print(matrix);
        System.out.println("---");
//        print(rotate(matrix));
//        rotateMD(matrix);
        rotateInPlace(matrix);
        print(matrix);
    }
}
