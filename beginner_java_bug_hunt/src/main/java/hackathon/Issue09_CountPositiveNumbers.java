public class Issue09_CountPositiveNumbers {
    static int countPositive(int[] values) {
        int count = 0;
        for (int value : values) {
            // BUG: zero is not positive.
            if (value >= 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPositive(new int[]{-2, 0, 3, 5}));
        // Expected: 2
    }
}
