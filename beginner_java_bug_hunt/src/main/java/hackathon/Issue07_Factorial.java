public class Issue07_Factorial {
    static long factorial(int n) {
        // BUG: factorial starts at 1 and multiplies each integer.
        long result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(4)); // Expected: 24
        System.out.println(factorial(1)); // Expected: 1
        System.out.println(factorial(0)); // Expected: 1
    }
}
