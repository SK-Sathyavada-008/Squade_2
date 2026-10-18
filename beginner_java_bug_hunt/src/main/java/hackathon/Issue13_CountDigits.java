public class Issue13_CountDigits {
    static int countDigits(int number) {
        int count = 0;
        // BUG: zero never enters the loop, but it has one digit.
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(12345)); // Expected: 5
        System.out.println(countDigits(7));     // Expected: 1
        System.out.println(countDigits(0));     // Expected: 1
    }
}
