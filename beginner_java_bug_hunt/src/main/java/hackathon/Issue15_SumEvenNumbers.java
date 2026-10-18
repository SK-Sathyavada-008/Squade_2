public class Issue15_SumEvenNumbers {
    static int sumEven(int[] values) {
        int sum = 0;
        for (int value : values) {
            // BUG: add only even values.
            sum += value;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumEven(new int[]{1, 2, 3, 4, 6}));
        // Expected: 12
    }
}
