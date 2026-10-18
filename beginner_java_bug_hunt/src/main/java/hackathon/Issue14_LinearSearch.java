public class Issue14_LinearSearch {
    static int search(int[] values, int target) {
        // BUG: loop skips the last array element.
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] values = {4, 8, 2, 9};
        System.out.println(search(values, 9));  // Expected: 3
        System.out.println(search(values, 10)); // Expected: -1
    }
}
