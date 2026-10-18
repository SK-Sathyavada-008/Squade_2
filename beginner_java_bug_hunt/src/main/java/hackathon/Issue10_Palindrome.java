public class Issue10_Palindrome {
    static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            // BUG: compare mirrored positions, not adjacent characters.
            if (word.charAt(i) != word.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("level")); // Expected: true
        System.out.println(isPalindrome("hello")); // Expected: false
        System.out.println(isPalindrome("aa"));    // Expected: true
    }
}
