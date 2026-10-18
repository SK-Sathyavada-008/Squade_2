public class Issue12_FizzBuzz {
    static String fizzBuzzValue(int number) {
        // BUG: multiples of 15 match the first branch before FizzBuzz.
        if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 15 == 0) {
            return "FizzBuzz";
        }
        return String.valueOf(number);
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzzValue(3));  // Expected: Fizz
        System.out.println(fizzBuzzValue(5));  // Expected: Buzz
        System.out.println(fizzBuzzValue(15)); // Expected: FizzBuzz
        System.out.println(fizzBuzzValue(7));  // Expected: 7
    }
}
