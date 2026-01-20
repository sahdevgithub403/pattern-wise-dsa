public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        int s1 = s.length();
        int s2 = t.length();

        while (i < s1 && j < s2) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            } 
            j++;  
        }
        return i == s.length();
    }

    public static void main(String[] sahdev) {
        String s = "abc";
        String t = "ahgdc";
        boolean res = isSubsequence(s, t);
        System.out.println(res);

    }
}