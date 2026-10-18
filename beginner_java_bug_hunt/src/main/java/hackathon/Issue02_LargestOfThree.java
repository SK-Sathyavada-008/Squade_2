public class Issue02_LargestOfThree {
    static int largest(int a, int b, int c) {
        // BUG: the first branch returns b instead of a.
        if (a > b && a > c) {
            return b;
        } else if (b > a && b > c) {
            return b;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(largest(9, 3, 5)); // Expected: 9
        System.out.println(largest(2, 8, 4)); // Expected: 8
        System.out.println(largest(6, 6, 1)); // Expected: 6
    }
}
