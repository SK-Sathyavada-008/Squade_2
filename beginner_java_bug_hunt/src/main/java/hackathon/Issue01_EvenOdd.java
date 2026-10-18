public class Issue01_EvenOdd {
    static String evenOrOdd(int number) {
        // BUG: condition and returned labels are inconsistent.
        if (number % 2 == 1) {
            return "Even";
        }
        return "Odd";
    }

    public static void main(String[] args) {
        System.out.println(evenOrOdd(4)); // Expected: Even
        System.out.println(evenOrOdd(7)); // Expected: Odd
        System.out.println(evenOrOdd(0)); // Expected: Even
    }
}
