public class ValidPalindrome {

    public static boolean validPalindrome(String s) {

        String p = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int n = p.length();

        for (int i = 0; i < n / 2; i++) {
            if (p.charAt(i) != p.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println("Output: " + validPalindrome(s));
    }
}
