public class Issue08_ArrayMaximum {
    static int maximum(int[] values) {
        int max = values[0];
        // BUG: last element is not visited.
        for (int i = 1; i < values.length - 1; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximum(new int[]{2, 4, 9})); // Expected: 9
        System.out.println(maximum(new int[]{8, 3, 5})); // Expected: 8
    }
}
