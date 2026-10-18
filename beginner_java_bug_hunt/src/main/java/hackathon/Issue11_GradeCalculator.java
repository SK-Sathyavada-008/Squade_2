public class Issue11_GradeCalculator {
    static String grade(int score) {
        // BUG: score > 100 is currently graded A.
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else if (score >= 0) {
            return "F";
        }
        return "Invalid";
    }

    public static void main(String[] args) {
        System.out.println(grade(95));  // Expected: A
        System.out.println(grade(80));  // Expected: B
        System.out.println(grade(59));  // Expected: F
        System.out.println(grade(101)); // Expected: Invalid
    }
}
