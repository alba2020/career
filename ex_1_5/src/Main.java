public class Main {

    public static boolean oneMod(String s1, String s2) {
        if (Math.abs(s1.length() - s2.length()) > 1) {
            return false;
        }
        boolean first = true;
        for (int i = 0, j = 0; i < s1.length() && j < s2.length(); i++, j++) {
            if (s1.charAt(i) != s2.charAt(j)) {
                if (! first) return false;
                first = false;

                if (s1.length() > s2.length()) j--;
                if (s1.length() < s2.length()) i--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        assert oneMod("one", "one");
//        assert oneMod("onex", "one");
//        assert !oneMod("onexx", "one");
//        assert !oneMod("she", "one");
//        assert !oneMod("abc", "one");
//        assert oneMod("onx", "one");
//
//        assert oneMod("pale", "ple");
//        assert oneMod("pales", "pale");
//        assert oneMod("pale", "bale");
//        assert oneMod("pale", "bake");

        System.out.println(oneMod("pale", "ple"));
        System.out.println(oneMod("pales", "pale"));
        System.out.println(oneMod("pale", "bale"));
        System.out.println(oneMod("pale", "bake"));
    }
}
