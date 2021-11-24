public class Main {
    public static String replace(String s) {
        char[] arr = s.toCharArray();
        int j = arr.length - 1;
        int i;
        for(i = lastSymPos(arr); i >= 0; i--) {
            if (arr[i] != ' ') {
                arr[j--] = arr[i];
            } else {
                arr[j--] = '0';
                arr[j--] = '2';
                arr[j--] = '%';
            }
        }
        return String.valueOf(arr, j - i, arr.length - j - 1);
    }


    public static int lastSymPos(char[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != ' ') return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(replace("hello good world!       "));
    }
}
