public class Issue04_MultiplicationTable {
    static void printTable(int number) {
        // BUG: should include the multiplier 10.
        for (int i = 1; i < 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        printTable(5);
        // Expected final line: 5 x 10 = 50
    }
}
