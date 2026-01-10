public class PracString {

    public static boolean ruleString(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

    public static void main(String[] args) {
        String s = "msdam";
        boolean res = ruleString(s);
        System.out.println(res);
    }
}
