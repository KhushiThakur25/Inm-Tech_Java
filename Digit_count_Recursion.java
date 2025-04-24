public class Digit_count_Recursion {
    static int count_digit(int n, int count) {
        if (n == 0) {
            return count;
        }
        return count_digit(n / 10, count + 1);
    }
    public static void main(String[] args) {
        int result = count_digit(456312, 0);
        System.out.println("your digit count is: " + result);
    }
}
