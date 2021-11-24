public class Main {

    public static String compress(String src) {
        if (src.length() < 3) return src;
        StringBuilder sb = new StringBuilder();
        char prev = src.charAt(0), c=0;
        int counter = 1;
        for (int i = 1; i < src.length(); i++) {
            c = src.charAt(i);
            if (c == prev) {
                counter++;
            } else {
                sb.append(prev);
                sb.append(counter);
                counter = 1;
            }
            prev = c;
        }
        if (counter > 0) {
            sb.append(c);
            sb.append(counter);
        }

        String compressed = sb.toString();
        if (compressed.length() < src.length()) {
            return compressed;
        } else {
            return src;
        }
    }

    public static void main(String[] args) {
        System.out.println(compress("hello"));
        System.out.println(compress("aaabbbccc"));
    }
}
