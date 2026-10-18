public class Issue05_CountVowels {
    static int countVowels(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // BUG: only lowercase vowels are counted.
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("Open Source")); // Expected: 4
        System.out.println(countVowels("JAVA"));        // Expected: 2
    }
}
