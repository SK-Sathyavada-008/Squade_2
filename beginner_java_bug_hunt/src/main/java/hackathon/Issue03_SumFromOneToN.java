public class Issue03_SumFromOneToN {
    static int sumToN(int n) {
        int sum = 0;
        // BUG: loop stops before n.
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumToN(5)); // Expected: 15
        System.out.println(sumToN(1)); // Expected: 1
        System.out.println(sumToN(0)); // Expected: 0
    }
}
