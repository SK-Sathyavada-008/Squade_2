public class Issue06_ReverseNumber {
    static int reverse(int number) {
        int reversed = 0;
        while (number > 0) {
            // BUG: digit extraction and accumulation are incorrect.
            int digit = number / 10;
            reversed = reversed + digit;
            number = number % 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1234)); // Expected: 4321
        System.out.println(reverse(50));   // Expected: 5
        System.out.println(reverse(7));    // Expected: 7
    }
}
